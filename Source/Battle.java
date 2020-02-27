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

    int playerActiveSlot = 0;
    int trainerActiveSlot = 0;

    int menuLocation = 0;

    Random rand = new Random();

    public Battle(Player you, Trainer opponet) {

        this.you = you;
        this.opponet = opponet;

        this.playerName = you.getName();
        this.trainerName = opponet.getName();

        this.playerTeam = you.getTeam();
        this.trainerTeam = opponet.getTeam();
        
        battleStart();
    }

    public void battleStart() {

        Text.clearScreen();
        Text.say(playerName + " V.S " + trainerName);
        Text.pauseNC();

        Text.say(trainerName + " Sent out " + trainerTeam.get(0).getName());
        Text.pauseNC();
        Text.say(playerName + " Sends out " + playerTeam.get(0).getName());

        Text.pauseNC();
        Text.clearScreen();

        battleLoop();
    }

    public void battleLoop() {

        while (true) {

            battleDraw();
        }
    }

    public void battleDraw() {

        Text.clearScreen();

        drawHealthBar(trainerTeam.get(trainerActiveSlot));
        Text.newLines(6);
        drawHealthBar(playerTeam.get(playerActiveSlot));
        Text.newLines(2);

        switch(menuLocation) {

            case 0:
                menuLocation = Text.drawMainBattleMenu();
                break;
            case 1:
                ArrayList<Move> moveList = new ArrayList<Move>();
                moveList = playerTeam.get(playerActiveSlot).getMoves();
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
                
                

            

        }

    }

    public static int calculateDamage(Pokemon attacker, Pokemon defender, Move move) {

        double levelMultiplier = ((2*attacker.getLevel())/5)+2;

        double statsMultiplier = (move.isPhysical()) ? 
            attacker.getActualAttack()/defender.getActualDefense() :
            attacker.getActualSpecial()/defender.getActualSpecial();

        double randomMultiplier = 0.85 + (1.0 - 0.85) * rand.nextDouble();
        double stabBonus = (attacker.getType().equals(move.getType())) ? 1.5 : 1;

        double damage = (((levelMultiplier*move.getPower()*statsMultiplier)/50)+2)*(stabBonus*randomMultiplier);

        return (int)Math.floor(damage);
    }

    public static void drawHealthBar(Pokemon creature) {

        int points = (creature.getTempHP()/creature.getMaxHP())*25;

        Text.say("  " + creature.getName()+ " LvL. " + creature.getLevel());
        System.out.print("██");
        for (int i = 0; i < points; i++) {

            System.out.print("=");
        }
        System.out.print("██");
    }

    

    
}