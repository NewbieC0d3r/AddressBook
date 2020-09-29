package addressbook;
import java.util.Scanner;

/**
 *
 * @author Mac
 */
public class AddressBook {
    // Declare private variables
       private static int yourAge = 0;
       private static int zipCode = 11111; 
       /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
        // TODO code application logic here
            Scanner myScanner = new Scanner(System.in);
            System.out.println("What is your name?");
            String yourName = myScanner.nextLine();
        // Prompt use to enter an int
            while (true) {
                try {
                    System.out.println("Enter you age (e.g. 32): ");
                    yourAge = Integer.parseInt(myScanner.next());
                    System.out.println("Enter your zip code (e.g. 11111)");
                    zipCode = Integer.parseInt(myScanner.next());
                    break;
                } 
                catch (NumberFormatException ne) {
                    System.err.println("NumberFormatException: " + ne.getMessage());
                    System.out.println("Please enter only numbers");                
                } 
                finally {
                        System.out.println("Thanks, "+yourName+"!");
                }
            } // End while loop

    }
}