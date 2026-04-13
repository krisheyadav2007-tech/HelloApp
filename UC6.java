public class UC6 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            String combinedNames = "";
            for (String arg : args) {
                combinedNames += arg + ", ";
            }
            // Remove the trailing comma and space
            combinedNames = combinedNames.substring(0, combinedNames.length() - 2);
            System.out.println("Hello, " + combinedNames + "!");
        }
    }
}