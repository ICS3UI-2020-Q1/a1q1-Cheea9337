import java.util.Scanner;

/** 
 * This will calculate celcius into fahrenheit
 * @author Aidan Cheesmond
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create a scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user for an amount of degrees celsius
    System.out.println("Please enter a temperature you would like to convert in degrees celsius.");

    // allow the user to enter the temperature
    int celsius = input.nextInt();

    // caclulates the user's temperature from celsius to fahrenheit
    int fahrenheit = (celsius*9)/5+32;

    // gives the user the fahrenheit conversion
    System.out.println(celsius + " in celsius is the same as " + fahrenheit + " in fahrenheit");

  }
}
