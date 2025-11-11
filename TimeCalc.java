public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int addMinutes = Integer.parseInt(args[1]);

        int totalMinutes = (hours * 60) + minutes + addMinutes;
        int newHours = (totalMinutes / 60) % 24; // mod 24 for wrap-around
        int newMinutes = totalMinutes % 60; // correct way to get remainder minutes

        // Proper formatting with leading zeros
        if (newHours < 10) System.out.print("0");
        System.out.print(newHours + ":");
        if (newMinutes < 10) System.out.print("0");
        System.out.println(newMinutes);
    }

}