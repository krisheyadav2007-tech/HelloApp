/**
 * UC6 Substring Method
 * * Uses an enhanced for loop to concatenate strings and the substring() 
 * method to remove the trailing delimiter.
 *
 * @author Developer
 * @version 6.0
 */
public class HelloWorldApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            String combinedNames = "";
            for (String arg : args) {
                combinedNames += arg + ", ";
            }
            
            // Remove the final trailing comma and space (last 2 characters)
            combinedNames = combinedNames.substring(0, combinedNames.length() - 2);
            
            System.out.println("Hello, " + combinedNames + "!");
        }
    }
}