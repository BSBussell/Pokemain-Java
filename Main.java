import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Text.clearScreen();
        
        Text.pickOption("Are you boi or gorl?", "yes", "gorl");
        String name = Text.response("What is your name: ");

        Player main = new Player(name,500);
        
        Text.say("Well " + name + ", Welcome to the world of Pokemon...");
        Text.pause();

        String[] places = new String[]{"Here","There","No","N-Word"};
        Text.menu("Where would you like to go?", places);

        loadBattleTest(main);
        
    }

    public static void loadBattleTest(Player main) {

        //Data sheet = new Data();

        Pokemon playable = Data.getPokemon(6,45);
        playable.addMove(Data.getMove(10),0);
        main.addPokemonToTeam(playable,0);

        Trainer opponet = Data.getTrainer(-1);

        Battle demo = new Battle(main,opponet);
    }
}

/*
// Cool Class Diagram
[Game Instance|- Game State|PlayerInfo:;Pokemon;Gym's Beaten;Money|mainMenu()]
[Game Instance]->[Battle|Catchable;Runable;xp Modifier]
[Battle]->[Trainer Battle]
[Battle]->[Wild]
[Battle]->[Gym Leader]
[Game Instance]->[PokeCenter|JustHeals]
[Game Instance]->[PokeMart|Menu for Shopping]


[Data|getPokemon();getMoves();getTrainer();getGymLeader();getItems();]
[Gym Leader] -> [Data]
[Wild]->[Data]
[Trainer Battle]->[Data]
[PokeMart]->[Data]

[Trainer|Name;Cash;isGymLeader|Pokemon]
[Data]->[Trainer]
[Trainer]->[Pokemon]
[Pokemon|Name;Level;Modifiers]
[Data]->[Pokemon]
*/