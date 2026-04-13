public class UC5 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            System.out.print("Hello, ");
            boolean isFirst = true;
            for (String arg : args) {
                if (!isFirst) {
                    System.out.print(", ");
                }
                System.out.print(arg);
                isFirst = false;
            }
            System.out.println("!");
        }
    }
}