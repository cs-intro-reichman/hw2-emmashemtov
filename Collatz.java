public class Collatz {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        String mode = args[1];

        for (int seed = 1; seed <= N; seed++) {
            long current = seed;
            int steps = 1;

            if (mode.equals("v")) System.out.print(current + " ");

            do {
                if (current % 2 == 0) current /= 2;
                else current = 3 * current + 1;

                steps++;
                if (mode.equals("v")) System.out.print(current + " ");
            } while (current != 1);

            if (mode.equals("v")) System.out.println("(" + steps + ")");
        }

        System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
    }
}
