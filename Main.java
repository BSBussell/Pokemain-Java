import java.util.Scanner;
import java.util.ArrayList;

class Main {
    
    
    
    public static void main(String[] args) {

        Text.clearScreen();
        
        Text.pickOption("Are you boi or gorl?", "yes", "gorl");
        String name = Text.response("What is your name: ");

        Player main = new Player(name,500);
        
        Text.clearScreen();
        Text.say("Well " + name + ", Welcome to the world of Pokemon...");
        Text.pause();

        
        starterPokemon(main);
        gameLoop(main);

        
        
    }

    public static void starterPokemon(Player main) {

        Text.say("AYY LMAO.");
        String[] starters = new String[]{"Charmander","Bulbasaur","Squirtle"};
        int selection = Text.menu("Pick a Starter Pokemon!", starters);

        switch(selection) {

            case 1:
                Text.say("You Picked Charmander!!!");
                Text.pause();
                Pokemon charmander = Data.getPokemon(4, 5);
                charmander.addMove(Data.getMove(27));
                charmander.addMove(Data.getMove(70));
                main.addPokemonToTeam(charmander,0);
                break;
            case 2:
                Text.say("You Picked Bulbasaur!!!");
                Text.pause();
                Pokemon bulbasaur = Data.getPokemon(1,5);
                bulbasaur.addMove(Data.getMove(0));
                bulbasaur.addMove(Data.getMove(86));
                main.addPokemonToTeam(bulbasaur,0);
                break;
            case 3:
                Text.say("You Picked Squirtle!!!");
                Text.pause();
                Pokemon squirtle = Data.getPokemon(7, 5);
                squirtle.addMove(Data.getMove(9));
                squirtle.addMove(Data.getMove(86));
                main.addPokemonToTeam(squirtle,0);
                break;
        }

    }

    public static void gameLoop(Player main) {

        /*Pokemon playable = Data.getPokemon(9,10);
        playable.addMove(Data.getMove(10),0);
        main.addPokemonToTeam(playable,0);*/


        while(true) {
            String[] places = new String[]{"Wild-Debug", "Trainer-Debug", "PokeCenter","PokeMart", "Pokemon"};
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

                Text.say("PokeMart " + main.getName());
                Text.pause();
            } else if (location == 5) {
            
                Text.clearScreen();

                ArrayList<String> stringList = new ArrayList<String>();
                for (Pokemon idv : main.getTeam()) 
                    stringList.add(idv.getName());
                    
                String[] listOfPokemon = new String[stringList.size()];
                listOfPokemon = stringList.toArray(listOfPokemon);
                int pokemon = Text.drawPokeList(listOfPokemon);

                Text.clearScreen();
                
                String[] options = new String[] {"Summary","Swap","Back"};
                int option = Text.menu("What would you like to do?",options);

                if (option == 3)
                    

                /*for (Pokemon idv : main.getTeam()) {
                    Text.say(idv.toString());
                    Text.pause();
                }*/
            } 
        }
    }

    public static void loadWildBattleTest(Player main) {

        Pokemon first = Data.getPokemon(1,5);
        first.addMove(Data.getMove(0));
        first.addMove(Data.getMove(27));
        first.addMove(Data.getMove(9));

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