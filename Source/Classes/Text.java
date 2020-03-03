import java.util.Scanner;


public class Text {

    static Scanner keyboard = new Scanner(System.in);;

    public static boolean pickOption(String prompt, String answerTrue, String answerFalse) {

        String response = "null";

        System.out.println(prompt);
        System.out.println("(1) " + answerTrue);
        System.out.println("(2) " + answerFalse);

        while (true) {
            
            System.out.print("> ");
            response = keyboard.nextLine();

            if (response.equalsIgnoreCase("1")) {
                break;
            }
            if (response.equalsIgnoreCase("2")) {
                break;
            }
        }

        
        return (response.equals("1")) ? true : false;
    }

    public static String response(String prompt) {

        String response = "";
        boolean confirm = false;
        
        while (!confirm) {
            
            clearScreen();
            System.out.println(prompt);

            System.out.print("> ");
            response = keyboard.nextLine();
            confirm  = pickOption("Are you sure with " + response + "?", "yes", "no");
        }
        
        return response;

    }

    public static int drawMainBattleMenu() {

        System.out.println("*===================*");
        System.out.println("= (1)Fight   (2)Bag =");
        System.out.println("=                   =");
        System.out.println("= (3)PKMN    (4)Run =");
        System.out.println("*===================*");

        newLines(3);
        String response = "null";
        
        while (true) {
            
            System.out.print("> ");
            response = keyboard.nextLine();

            if (response.equalsIgnoreCase("1")) {
                break;
            }
            if (response.equalsIgnoreCase("2")) {
                break;
            }
            if (response.equalsIgnoreCase("3")) {
                break;
            }
            if (response.equalsIgnoreCase("4")) {
                break;
            }
            
        }

        return Integer.parseInt(response);
    }

    public static int drawAttackMenu(String move1, String move2, String move3, String move4) {

        String emptySpace = "                    ";
        move1 = move1 + emptySpace.substring(0,20-move1.length());
        move2 = move2 + emptySpace.substring(0,20-move2.length());
        move3 = move3 + emptySpace.substring(0,20-move3.length());
        move4 = move4 + emptySpace.substring(0,20-move4.length());
        
        System.out.println("*========================*");
        System.out.println("= (1)"+move1+"=");
        System.out.println("= (2)"+move2+"=");
        System.out.println("= (3)"+move3+"=");
        System.out.println("= (4)"+move4+"=");
        System.out.println("= (5)Back                =");
        System.out.println("*========================*");      

        newLines(3);
        String response = "null";
        
        while (true) {
            
            System.out.print("> ");
            response = keyboard.nextLine();

            if (response.equalsIgnoreCase("1")) {
                break;
            }
            if (response.equalsIgnoreCase("2")) {
                break;
            }
            if (response.equalsIgnoreCase("3")) {
                break;
            }
            if (response.equalsIgnoreCase("4")) {
                break;
            }
            if (response.equalsIgnoreCase("5")) {
                break;
            }
            
        }

        return Integer.parseInt(response);  
    }

    public static int drawBagSpace(int[] items) {

        System.out.println("*========================*");
        System.out.println("= (1)Poke Ball "  + "x" + items[0]+"=");
        System.out.println("= (2)Great Ball " + "x" + items[1]+"=");
        System.out.println("= (3)Ultra Ball " + "x" + items[2]+"=");
        System.out.println("= (4)Master Ball " + "x" + items[3]+"=");
        System.out.println("= (5)Back                =");
        System.out.println("*========================*");

        String response;

        while (true) {

            System.out.print("> ");
            response = keyboard.nextLine();

            if (response.equalsIgnoreCase("1")) {
                break;
            }
            if (response.equalsIgnoreCase("2")) {
                break;
            }
            if (response.equalsIgnoreCase("3")) {
                break;
            }
            if (response.equalsIgnoreCase("4")) {
                break;
            }
            if (response.equalsIgnoreCase("5")) {
                break;
            }

        }

        return Integer.parseInt(response);
    }

    public static void newLines(int amount) {

        for (int i = 0; i < amount; i++) {

            System.out.println();
        }
    }

    public static void say(String text) {

        System.out.println(text);
    }

    public static int menu(String prompt, String[] choices) {

        int result = -1;
        int count = 1;

        while(!(result > 0 && result <= choices.length)) {
            clearScreen();
            System.out.println(prompt);

            count = 1;
            for (String items : choices) {

                System.out.println("(" + count + ") "+items);
                count++;
            }

            System.out.print("> ");
            
            while (!keyboard.hasNextInt()) {
                System.out.println("Why do you want to see us fail?");
                System.out.print("> ");
                keyboard.next(); 
            }

            result = keyboard.nextInt();
        }
        keyboard.nextLine();
        return result;
    }

    public static void pause() {

        System.out.println("\nPress \"ENTER\" to continue. . .");
        keyboard.nextLine();
        clearScreen();
    }

    public static void pauseNC() {
        System.out.print(". . .");
        keyboard.nextLine();

    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  // Before Sanford ask me how this works, im just gonna cite StackOverflow as the author of this magical method.

    
}