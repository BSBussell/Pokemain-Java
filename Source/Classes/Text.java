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

            response = keyboard.nextLine();
            confirm  = pickOption("Are you sure with " + response + "?", "yes", "no");
        }
        
        return response;

    }

    public static void say(String text) {

        System.out.println(text);
    }

    public static int menu(String prompt, String[] choices) {

        int result = -1;
        int count = 1;

        while(!(result > 0 && result < choices.length)) {
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
        System.out.println(". . .");
        keyboard.nextLine();

    }

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  

    
}