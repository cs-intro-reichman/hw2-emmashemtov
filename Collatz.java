public class Collatz {
    public static void main(String[] args) {
        // Parse command-line arguments
        int N = Integer.parseInt(args[0]);
        String mode = args[1];

        // Loop through all seeds from 1 to N
        for (int seed = 1; seed <= N; seed++) {
            int current = seed;
            int steps = 1; // seed counts as first step

            if (mode.equals("v")) {
                // Print the first number
                System.out.print(current + " ");
            }

            // Generate the hailstone sequence
            while (current != 1) {
                if (current % 2 == 0) {
                    current = current / 2;
                } else {
                    current = 3 * current + 1;
                }

                steps++; // increment step count

                if (mode.equals("v")) {
                    System.out.print(current + " ");
                }
            }

            // Print steps in parentheses
            if (mode.equals("v")) {
                System.out.println("(" + steps + ")");
            }
        }

        // Print summary line
        System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
    }
}
