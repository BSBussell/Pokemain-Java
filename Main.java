import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Text.clearScreen();
        
        Text.pickOption("Are you boi or gorl?", "yes", "gorl");
        String name = Text.response("What is your name: ");

        Player main = new Player(name,500);
        
        Text.say("Well " + name + ", Welcome to the world of Pokemon...");
        Text.pause();

        gameLoop(main);

        
        
    }

    public static void gameLoop(Player main) {

        Pokemon playable = Data.getPokemon(9,45);
        playable.addMove(Data.getMove(10),0);
        main.addPokemonToTeam(playable,0);


        while(true) {
            String[] places = new String[]{"Wild", "Trainer", "PokeCenter","DeBug","N-Word", "STats"};
            int location = Text.menu("Where would you like to go?", places);
            if (location == 3) {

                main.healTeam();
                Text.say("Pokemon have been Healed.");
                Text.pause();
            } else if (location == 4) {

                Text.say("Loading Debug Battle. . .");
                main = loadBattleTest(main);
            } else if (location == 5) {
            
                Text.say("39 Lashing for " + main.getName());
                Text.pause();
            } else if (location == 6) {

                Text.say(""+main.getTeam().get(0).getTempHP());
                Text.pause();
            }
        }
    }

    public static Player loadBattleTest(Player main) {

        //Data sheet = new Data();

        
        Trainer opponet = Data.getTrainer(-1);

        Battle demo = new Battle(main,opponet);

        return demo.battleStart();
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