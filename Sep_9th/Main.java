public class Main {
    public static void main(String[] args) {
        try {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);

            if (x > 0 && y > 0) {
                System.out.println((x + y) * 2);
                System.out.println(x*y);
            } else {
                System.out.println("Both x and y must be greater than 0.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid integers.");
        }
    }
}

