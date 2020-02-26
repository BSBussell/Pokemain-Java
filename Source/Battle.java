import java.util.ArrayList;


public class Battle {

    Player you;
    Trainer opponet;

    String playerName;
    String trainerName;

    ArrayList<Pokemon> playerTeam = new ArrayList<Pokemon>();
    ArrayList<Pokemon> trainerTeam = new ArrayList<Pokemon>();

    int playerActiveSlot = 0;
    int trainerActiveSlot = 0;

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

        Text.pause();

    }

    public void battleLoop() {

    }
}