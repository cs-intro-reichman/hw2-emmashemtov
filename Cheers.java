public class Cheers {
    public static void main(String[] args) {
        String word = args[0].toUpperCase();
        int n = Integer.parseInt(args[1]);

        String anLetters = "AEFHILMNORSX";

        // Step 1: Give me a/an lines
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (anLetters.indexOf(ch) != -1) {
                System.out.println("Give me an " + ch + ": " + ch + "!");
            } else {
                System.out.println("Give me a " + ch + ": " + ch + "!");
            }
        }

        // Step 2: The spell section
        System.out.println("What does that spell?");
        for (int i = 0; i < n; i++) {
            System.out.println(word + "!!!");
        }
    }
}
