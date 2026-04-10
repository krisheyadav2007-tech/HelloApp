/**
 * UC7 String.join Method
 * * Efficiently concatenates multiple names using the built-in String.join() method.
 *
 * @author Developer
 * @version 7.0
 */
public class HelloWorldApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // String.join automatically handles the commas perfectly
            String combinedNames = String.join(", ", args);
            System.out.println("Hello, " + combinedNames + "!");
        }
    }
}