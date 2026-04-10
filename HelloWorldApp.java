/**
 * UC4 Display Multiple Names
 * * Accepts multiple names and displays a personalized greeting using a standard for loop.
 *
 * @author Developer
 * @version 4.0
 */
public class HelloWorldApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            System.out.print("Hello, ");
            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i]);
                // Add a comma and space unless it's the last name
                if (i < args.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("!");
        }
    }
}