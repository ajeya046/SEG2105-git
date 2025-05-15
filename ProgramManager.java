
import java.util.Scanner;

public class MainOutput {
    //Scanner Setup = new Scanner(System.in);;

    public MainOutput() {
        //Scanner Setup = new Scanner(System.in);
    }

    public static void participantSetup() {

    }

    public static void organizerSetup() {
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner Setup = new Scanner(System.in);
        System.out.println("Hello, user. Do you wish to create a (*Organizer*) or (*Participant*) account... ");
        String inputtedString = Setup.nextLine();
        inputtedString = inputtedString.toLowerCase();
        switch (inputtedString) {
            case "participant":
                System.out.println("Testing: partipant creation called... ");
            case "organizer":
                System.out.println("Testing: organizer creation called... ");
            case "admin":
                System.out.println("Testing: admin called... ");
            
        }
    }
}
