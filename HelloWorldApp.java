/**
 * UC3 Display Name or Default
 * * Accepts a user's name as a command-line argument. 
 * If no name is provided, defaults to "World".
 *
 * @author Developer
 * @version 3.0
 */
public class HelloWorldApp {
    public static void main(String[] args) {
        // Check if an argument was provided
        if (args.length > 0) {
            System.out.println("Hello, " + args[0] + "!");
        } else {
            System.out.println("Hello, World!");
        }
    }
}