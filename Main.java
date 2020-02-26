import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hi boy or gorl?");
        System.out.println("What is you Name: ");

        String name = keyboard.nextLine();

        System.out.println(name + ", so you're the person...");

        Player main = new Player(name,500);

        loadBattleTest(main);
        
    }

    public static void loadBattleTest(Player main) {

        //Data sheet = new Data();

        Pokemon playable = Data.getPokemon(4,45);
        main.addPokemonToTeam(playable,0);

        System.out.println(main.team);


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