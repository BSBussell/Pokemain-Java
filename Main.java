import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Text.clearScreen();
        
        Text.pickOption("Are you boi or gorl?", "yes", "gorl");
        String name = Text.response("What is your name: ");

        Player main = new Player(name,500);
        
        Text.clearScreen();
        Text.say("Well " + name + ", Welcome to the world of Pokemon...");
        Text.pause();

        gameLoop(main);

        
        
    }

    public static void gameLoop(Player main) {

        Pokemon playable = Data.getPokemon(9,10);
        playable.addMove(Data.getMove(10),0);
        main.addPokemonToTeam(playable,0);


        while(true) {
            String[] places = new String[]{"Wild-Debug", "Trainer-Debug", "PokeCenter","N-Word", "Stats"};
            int location = Text.menu("Where would you like to go?", places);
            if (location == 1) {

                Text.say("Loading Debug Battle. . .");
                Text.pause();
                loadWildBattleTest(main);
            } else if (location == 2) {
                
                Text.say("Loading Debug Battle. . .");
                Text.pause();
                loadTrainerBattleTest(main);
            } else if (location == 3) {

                main.healTeam();
                Text.say("Pokemon have been Healed.");
                Text.pause();
            } else if (location == 4) {

                Text.say("39 Lashing for " + main.getName());
                Text.pause();
            } else if (location == 5) {
            
                
                for (Pokemon idv : main.getTeam()) {
                    Text.say(idv.toString());
                    Text.pause();
                }
            } 
        }
    }

    public static void loadWildBattleTest(Player main) {

        Pokemon first = Data.getPokemon(6,10);
        first.addMove(Data.getMove(28),0);

        Battle demo = new Battle(main, first);
        demo.battleStart();
    }

    public static void loadTrainerBattleTest(Player main) {

        Trainer opponet = Data.getTrainer(-1);

        Battle demo = new Battle(main, opponet);
        demo.battleStart();
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