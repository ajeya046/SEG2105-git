
//import java.security.SecurityPermission;
import java.util.Scanner;

public class ProgramManager {
    //Scanner Setup = new Scanner(System.in);
    //ArrayList<UserAccount> userAccounts;

    public ProgramManager() {
        //ArrayList<UserAccount> userAccounts = new ArrayList<UserAccount>();
        //Scanner Setup = new Scanner(System.in);
    }

    public static void participantSetup() {

    }

    public static void organizerSetup() {
        Scanner organizerSetup = new Scanner(System.in);
        System.out.println("Hello, Organizer. ");
        System.out.println("Organizer, what is your username for account creation... ");
        String inputtedUsername = organizerSetup.nextLine();
        System.out.println("Organizer, what is your password for account creation... ");
        String inputtedPassword = organizerSetup.nextLine();
        Organizer createdOrganizer = new Organizer(inputtedUsername, inputtedPassword);
        createdOrganizer.welcome();
        createdOrganizer.addUserAccount();
        //return createdOrganizer;
        //userAccounts.add(createdOrganizer);
    }

    public static void main(String[] args) {
        Scanner Setup = new Scanner(System.in);
        System.out.println("Hello, user. Do you wish to create a (*Organizer*) or (*Participant*) account... ");
        String inputtedString = Setup.nextLine();
        inputtedString = inputtedString.toLowerCase();
        switch (inputtedString) {
            case "participant":
                System.out.println("Testing: partipant creation called... ");
                organizerSetup();
                //userAccounts.add(organizerSetup());
            case "organizer":
                System.out.println("Testing: organizer creation called... ");
            case "admin":
                System.out.println("Testing: admin called... ");
            
        }
    }
}
