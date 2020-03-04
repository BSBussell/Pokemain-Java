import java.util.ArrayList;
import java.util.Random;
import java.lang.Math;

public class Battle {

    private Player you;
    private Trainer opponent;

    private String playerName;
    private String trainerName;

    private boolean isTrainer = true;
    private boolean caught = false;
    private boolean escape = false;

    private ArrayList<Pokemon> playerTeam = new ArrayList<Pokemon>();
    private ArrayList<Pokemon> trainerTeam = new ArrayList<Pokemon>();

    private Pokemon playerActivePokemon;
    private Pokemon trainerActivePokemon;

    private int playerActiveSlot = 0;
    private int trainerActiveSlot = 0;

    private int menuLocation = 0;

    public Battle(Player you, Trainer opponent) {

        this.you = you;
        this.opponent = opponent;

        this.playerName = you.getName();
        this.trainerName = opponent.getName();

        this.playerTeam = you.getTeam();
        this.trainerTeam = opponent.getTeam();

        this.playerActivePokemon = playerTeam.get(0);
        this.trainerActivePokemon = trainerTeam.get(0);

    }

    public Battle(Player you, Pokemon wild) {

        this.you = you;
        this.opponent = new Trainer();

        this.opponent.setName("a Wild " + wild.getName());
        this.opponent.setTeamSize(1);
        this.opponent.setPrize(0);
        this.opponent.addPokemon(wild);

        this.isTrainer = false;

        this.playerName = you.getName();
        this.trainerName = this.opponent.getName();

        this.playerTeam = you.getTeam();
        this.trainerTeam = this.opponent.getTeam();

        this.playerActivePokemon = playerTeam.get(0);
        this.trainerActivePokemon = trainerTeam.get(0);
    }

    public void battleStart() {

        Text.clearScreen();
        

        if (isTrainer) {
            Text.say("You are challenged by trainer "+ trainerName);
            Text.pauseNC();
            Text.say(trainerName + " Sent out " + trainerActivePokemon.getName());
            Text.pauseNC();
        } else {
            Text.say(trainerName + " appeared!");
            Text.pauseNC();

        }
        Text.say(playerName + " Sends out " + playerActivePokemon.getName());

        Text.pauseNC();
        Text.clearScreen();

        battleLoop();
    }

    public void battleLoop() {

        while (true) {

            battleDraw(); // This is where all the battle logic is kept

            if (trainerActivePokemon.getTempHP() < 0) {

                Text.say(trainerActivePokemon.getName() + " has fainted. . .");
                int expGained = trainerActivePokemon.expYield()*playerActivePokemon.getLevel();
                playerActivePokemon.addEXP(expGained);
                

                Text.pauseNC();

                if( !anyUsable(trainerTeam)) {

                    Text.say(playerName + " defeated " + trainerName);
                    Text.pauseNC();

                }

                return;
            } else if (playerTeam.get(trainerActiveSlot).getTempHP() < 0) {

                Text.say(playerActivePokemon.getName() + " has fainted. . .");

                if( !anyUsable(playerTeam)) {

                    Text.say(playerName + " is out of usable Pokemon.");
                }
                Text.pauseNC();
                return;
            }
            if (caught) {

                return;
            }

            if (escape) {

                return;
            }
        }

    }

    public void battleDraw() {

        Move playerTurn;
        Move opponetTurn;

        Text.clearScreen();

        drawHealthBar(trainerActivePokemon);
        Text.newLines(6);
        drawHealthBar(playerActivePokemon);
        Text.newLines(2);

        switch (menuLocation) {

            case 0:
                menuLocation = Text.drawMainBattleMenu();
                break;
            case 1:
                ArrayList<Move> moveList = new ArrayList<Move>();
                moveList = playerActivePokemon.getMoves();
                String move1, move2, move3, move4;
                if (moveList.size() > 0)
                    move1 = moveList.get(0).getName();
                else
                    move1 = "~~~~";
                if (moveList.size() > 1)
                    move2 = moveList.get(1).getName();
                else
                    move2 = "~~~~";
                if (moveList.size() > 2)
                    move3 = moveList.get(2).getName();
                else
                    move3 = "~~~~";
                if (moveList.size() > 3)
                    move4 = moveList.get(3).getName();
                else
                    move4 = "~~~~";

                menuLocation = Text.drawAttackMenu(move1, move2, move3, move4);
                if (moveList.size() <= menuLocation - 1 && menuLocation != 5) {
                    menuLocation = -9;
                }
                menuLocation = (menuLocation == 5) ? 0 : menuLocation + 10;
                break;
        case 2:

            int bagSelection = Text.drawBagSpace(you.getBag());

            if (bagSelection!=5)
                if (isTrainer) {

                    Text.say("You can't use this on a trainers Pokemon!");
                    Text.pause();
                    break;
                
                } else if (you.getBag()[bagSelection-1] <= 0) {

                    Text.say("You are out of this item");
                    Text.pauseNC();

                } else if (catchAttempt(bagSelection)) {

                    Text.say("You used a ball on " + trainerActivePokemon.getName());
                    Text.pauseNC();
                    you.addPokemonNext(trainerActivePokemon);
                    Text.say("Gotcha, the " + trainerActivePokemon.getName() + " was caught!");
                    Text.pause();
                    caught = true;
                } else {
                    Text.say("You used a ball on " + trainerActivePokemon.getName());
                    Text.say("It did not work.");
                    Text.pauseNC();
                    opponetAttack();
                }


            menuLocation = 0;
            break;
        case 3:
            Text.say("WIP");
            Text.pause();
            menuLocation = 0;
            break;
        case 4:
            if (this.isTrainer) {
                Text.say("This is a trainer battle, you can't run away.");
                Text.pause();
                menuLocation = 0;
                break;
            } else {
                Text.say("PLease chill guys I can only work so fast...");
                int top = this.playerActivePokemon.getActualSpeed()*28;
                int chance = (top/this.trainerActivePokemon.getActualSpeed())+30;
                if (chance > 60) {
                    Text.say("You got away safely.");
                    Text.pause();
                    escape = true;
                    break;
                }
                Text.say("You couldn't get away.");
                Text.pauseNC();
                opponetAttack();

                menuLocation = 0;
                break;
            }
        case 11:

            playerTurn = playerActivePokemon.getMoves().get(0);
            opponetTurn = enemyMove(trainerActivePokemon, playerActivePokemon);

            takeTurn(playerTurn, opponetTurn);
            

            menuLocation = 0;
            break;
        case 12:

            playerTurn = playerActivePokemon.getMoves().get(1);
            opponetTurn = enemyMove(trainerActivePokemon, playerActivePokemon);

            takeTurn(playerTurn, opponetTurn);
            

            menuLocation = 0;
            break;
        case 13:

            playerTurn = playerActivePokemon.getMoves().get(2);
            opponetTurn = enemyMove(trainerActivePokemon, playerActivePokemon);

            takeTurn(playerTurn, opponetTurn);
            

            menuLocation = 0;
            break;

        case 14:

            playerTurn = playerActivePokemon.getMoves().get(3);
            opponetTurn = enemyMove(trainerActivePokemon, playerActivePokemon);

            takeTurn(playerTurn, opponetTurn);
            

            menuLocation = 0;
            break;




        }

    }

    public boolean catchAttempt(int ball) {
        Random rand = new Random();

        if (ball == 4)
            return true;

        double ballOdds;

        switch(ball) {
            case 1:
                ballOdds = 1.0;
                break;

            case 2:
                ballOdds = 1.5;
                break;
            default:
                ballOdds = 2.0;
                break;
        }

        double topLeft = 3.0*(double)trainerActivePokemon.getMaxHP()-2.0*(double)trainerActivePokemon.getTempHP();
        double topRight = 127.0 * ballOdds;
        double bottom = 3.0*(double)trainerActivePokemon.getMaxHP();

        double p1 = (topLeft*topRight)/bottom;

        double roll = (double)rand.nextInt(100)+1;

        return (roll<=p1);



    }

    public void playerAttack() {
        Text.say(playerActivePokemon.getName() + " used " + playerAttack.getName());
        int damageDone = calculateDamage(playerActivePokemon, trainerActivePokemon, playerAttack);

        double typeBonus = Data.typeEffectiveness(playerAttack.getType(), trainerActivePokemon.getType());
        
        if (typeBonus == 0.0) {
            Text.say("It had no effect.");
        } else if (typeBonus == 0.5) {
            Text.say("It was not very effective.");
        } else if (typeBonus == 2.0) {
            Text.say("It was super effective.");
        }

        trainerActivePokemon.damage(damageDone);
        Text.pauseNC();
        moveEffects(playerActivePokemon, trainerActivePokemon,playerAttack);   

    }

    public void opponetAttack() {

        Move opponetAttack = enemyMove(trainerActivePokemon, playerActivePokemon);
        Text.say(trainerActivePokemon.getName() + " used " + opponetAttack.getName());
        int opponetDamage = calculateDamage(trainerActivePokemon, playerActivePokemon, opponetAttack);

        typeBonus = Data.typeEffectiveness(opponetAttack.getType(), playerActivePokemon.getType());
        
        if (typeBonus == 0.0) {
            Text.say("It had no effect.");
        } else if (typeBonus == 0.5) {
            Text.say("It was not very effective.");
        } else if (typeBonus == 2.0) {
            Text.say("It was super effective.");
        }

        playerActivePokemon.damage(opponetDamage);
        Text.pauseNC();
        moveEffects(trainerActivePokemon, playerActivePokemon, opponetAttack);
    }

    public void takeTurn(Move playerAttack, Move opponetAttack) {
        
        if (playerActivePokemon.getActualSpeed() > trainerActivePokemon.getActualSpeed()) {

            playerAttack();
            

            if (playerActivePokemon.getTempHP() <= 0 || trainerActivePokemon.getTempHP() <= 0) {
                return;
            }

            
            opponetAttack();

            


        } else {

            opponetAttack();
            

            if (playerActivePokemon.getTempHP() <= 0 || trainerActivePokemon.getTempHP() <= 0) {
                return;
            }

            playerAttack();

            

        }

    }

    public void moveEffects(Pokemon user, Pokemon defender, Move attack) {

        switch(attack.getName()) {

            case "Explosion":
                Text.say(user.getName() + " blew itself up. . .");
                Text.pauseNC();
                user.damage(9999);
                break;
            case "Night Shade":
                defender.damage(user.getLevel());
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
            slot = slot + 1;

        }
        return attacker.getMoves().get(maxSlot);
    }

    public static int calculateDamage(Pokemon attacker, Pokemon defender, Move move) {

        Random rand = new Random();

        double levelMultiplier = ((2 * attacker.getLevel()) / 5) + 2;

        double statsMultiplier = (move.isPhysical()) ? attacker.getActualAttack() / defender.getActualDefense()
                : attacker.getActualSpecial() / defender.getActualSpecial();

        statsMultiplier = (statsMultiplier == 0) ? 1 : statsMultiplier;

        double randomMultiplier = 0.85 + (1.0 - 0.85) * rand.nextDouble();
        double stabBonus = (attacker.getType().equals(move.getType())) ? 1.5 : 1;
        double typeBonus = Data.typeEffectiveness(move.getType(), defender.getType());

        double damage = (((levelMultiplier * move.getPower() * statsMultiplier) / 50) + 2)
                * (stabBonus * randomMultiplier * typeBonus);

        

        return (int) Math.floor(damage);
    }

    public static boolean anyUsable(ArrayList<Pokemon> team) {

        for (Pokemon creatures : team) {

            if (creatures.getTempHP() >= 0) {

                return true;
            }
        }

        return false;
    }

    public static void drawHealthBar(Pokemon creature) {

        double percent = ((double) creature.getTempHP() / (double) creature.getMaxHP());
        int points = (int) Math.floor(percent * 25.0);

        Text.say("  " + creature.getName() + " LvL. " + creature.getLevel());
        System.out.print("██");
        for (int i = 0; i < points; i++) {

            System.out.print("=");
        }
        for (int i = points; i < 25; i++) {

            System.out.print(" ");
        }
        System.out.print("██");
    }

}