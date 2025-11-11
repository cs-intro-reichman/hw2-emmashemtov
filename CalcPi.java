// Computes an approximation of PI.
public class CalcPi {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]); // number of terms
        double sum = 0.0;

        for (int i = 0; i < n; i++) {
            sum += Math.pow(-1, i) / (2.0 * i + 1);
        }

        double piApprox = 4 * sum;

        System.out.println("pi according to Java: " + Math.PI);
        System.out.println("pi, approximated: " + piApprox);
    }

}