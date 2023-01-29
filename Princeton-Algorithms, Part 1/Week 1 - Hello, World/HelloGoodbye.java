public class HelloGoodbye {
    public static void main(String[] args) {
        if (args.length == 2) {
            System.out.println("Hello " + args[0] + " " + args[1]);
            System.out.println("Goodbye " + args[1] + " " + args[0]);
        }
        else {
            System.out.println("Please give 2 names");
        }

    }
}
