import java.util.ArrayList;
import java.util.Random;
import java.lang.Math; 

public class Battle {

    Player you;
    Trainer opponet;

    String playerName;
    String trainerName;

    ArrayList<Pokemon> playerTeam = new ArrayList<Pokemon>();
    ArrayList<Pokemon> trainerTeam = new ArrayList<Pokemon>();

    Pokemon playerActivePokemon;
    Pokemon trainerActivePokemon;

    int playerActiveSlot = 0;
    int trainerActiveSlot = 0;

    int menuLocation = 0;

    

    public Battle(Player you, Trainer opponet) {

        this.you = you;
        this.opponet = opponet;

        this.playerName = you.getName();
        this.trainerName = opponet.getName();

        this.playerTeam = you.getTeam();
        this.trainerTeam = opponet.getTeam();

        this.playerActivePokemon = playerTeam.get(0);
        this.trainerActivePokemon = trainerTeam.get(0);
        
    }

    public Player battleStart() {

        Text.clearScreen();
        Text.say(playerName + " V.S " + trainerName);
        Text.pauseNC();

        Text.say(trainerName + " Sent out " + playerActivePokemon.getName());
        Text.pauseNC();
        Text.say(playerName + " Sends out " + trainerActivePokemon.getName());

        Text.pauseNC();
        Text.clearScreen();

        return battleLoop();
    }

    public Player battleLoop() {

        while (trainerActivePokemon.getTempHP() > 0 && playerActivePokemon.getTempHP() > 0) {

            battleDraw();
        }
        
        if (trainerActivePokemon.getTempHP() < 0) {

            Text.say(trainerActivePokemon.getName() + " has fainted. . .");
            Text.pauseNC();

            if( !anyUsable(trainerTeam)) {

                Text.say(trainerName + " is out of usable Pokemon.");
            }

            Text.pauseNC();
            return you;
        } else if (playerTeam.get(trainerActiveSlot).getTempHP() < 0) {

            Text.say(playerActivePokemon.getName() + " has fainted. . .");

            if( !anyUsable(playerTeam)) {

                Text.say(playerName + " is out of usable Pokemon.");
            }
            Text.pauseNC();
            return you;
        } else {
            Text.say("I know it is possible to reach this point somehow. However right now I have a headache\n"+
                    "and i'm in so many layers of abstraction that I'm kind of losing track. . .");
            return you;
        }
    }
 
    public void battleDraw() {

        Text.clearScreen();

        drawHealthBar(trainerActivePokemon);
        Text.newLines(6);
        drawHealthBar(playerActivePokemon);
        Text.newLines(2);

        switch(menuLocation) {

            case 0:
                menuLocation = Text.drawMainBattleMenu();
                break;
            case 1:
                ArrayList<Move> moveList = new ArrayList<Move>();
                moveList = playerActivePokemon.getMoves();
                String move1,move2,move3,move4;
                if (moveList.size()>0)
                    move1 = moveList.get(0).getName();
                else
                    move1 = "~~~~";
                if (moveList.size()>1)
                    move2 = moveList.get(1).getName();
                else
                    move2 = "~~~~";
                if (moveList.size()>2)
                    move3 = moveList.get(2).getName();
                else
                    move3 = "~~~~";
                if (moveList.size()>3)
                    move4 = moveList.get(3).getName();
                else
                    move4 = "~~~~";

                menuLocation = Text.drawAttackMenu(move1, move2, move3, move4);
                if (moveList.size()<=menuLocation-1 && menuLocation != 5) {
                    menuLocation = -9;
                }
                menuLocation = (menuLocation==5) ? 0 : menuLocation+10;
                break;
            case 2:
                Text.say("WIP");
                Text.pause();
                menuLocation = 0;
                break;
            case 3:
                Text.say("WIP");
                Text.pause();
                menuLocation = 0;
                break;
            case 4:
                Text.say("This is a trainer battle, you can't run away.");
                Text.pause();
                menuLocation = 0;
                break;
            case 11:
                
                Move slot1 = playerActivePokemon.getMoves().get(0);

                if (playerActivePokemon.getActualSpeed() > trainerActivePokemon.getActualSpeed()) {

                    Text.say(playerActivePokemon.getName() +" used " + slot1.getName());
                    int damageDone = calculateDamage(playerActivePokemon, trainerActivePokemon, slot1);
                    
                    trainerActivePokemon.damage(damageDone);
                    
                    Text.pauseNC();

                    if (trainerActivePokemon.getTempHP() <= 0) {
                        break;
                    }

                    Move opponetTurn = enemyMove(trainerActivePokemon, playerActivePokemon);
                    Text.say(trainerActivePokemon.getName() + " used " + opponetTurn.getName());
                    int opponetDamage = calculateDamage(trainerActivePokemon, playerActivePokemon, opponetTurn);

                    playerActivePokemon.damage(opponetDamage);

                    if (opponetTurn.getName().equals("Explosion")) {

                        Text.say(trainerName+"'s " + playerActivePokemon.getName() + " blew itself up. . .");
                        trainerActivePokemon.damage(9999);
                    }

                    Text.pauseNC();

                    menuLocation = 0;

                }
                

            

        }

    }


    public static Move enemyMove(Pokemon attacker, Pokemon defender) {

        Move choice = new Move();

        int maxDamage = 0;
        int maxSlot = 0;
        int slot = 0;

        for (Move attack : attacker.getMoves()) {

            if (attack.isDamaging()) {

                if (calculateDamage(attacker, defender, attack) >= maxDamage) {

                    maxDamage = calculateDamage(attacker, defender, attack);
                    maxSlot = slot;
                }
                
            }
            slot = slot+1;


        }
        return attacker.getMoves().get(maxSlot);
    }

    public static int calculateDamage(Pokemon attacker, Pokemon defender, Move move) {

        Random rand = new Random();

        double levelMultiplier = ((2*attacker.getLevel())/5)+2;

        
        double statsMultiplier = (move.isPhysical()) ? 
            attacker.getActualAttack()/defender.getActualDefense() :
            attacker.getActualSpecial()/defender.getActualSpecial();

        statsMultiplier = (statsMultiplier==0) ? 1 : statsMultiplier;

        double randomMultiplier = 0.85 + (1.0 - 0.85) * rand.nextDouble();
        double stabBonus = (attacker.getType().equals(move.getType())) ? 1.5 : 1;

        double damage = (((levelMultiplier*move.getPower()*statsMultiplier)/50)+2)*(stabBonus*randomMultiplier);
        

        return (int)Math.floor(damage);
    }

    public static boolean anyUsable(ArrayList<Pokemon> team) {

        for (Pokemon creatures : team) {
            
            
            if (creatures.getTempHP() >= 0 ) {

                return true;
            }
        }

        return false;
    }

    public static void drawHealthBar(Pokemon creature) {

        double percent = ((double)creature.getTempHP()/(double)creature.getMaxHP());
        int points = (int)Math.floor(percent*25.0);

        Text.say("  " + creature.getName()+ " LvL. " + creature.getLevel());
        System.out.print("██");
        for (int i = 0; i < points; i++) {

            System.out.print("=");
        }
        for (int i = points; i<25; i++) {

            System.out.print(" ");
        }
        System.out.print("██");
    }

    

    
}