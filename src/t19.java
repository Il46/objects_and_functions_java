public class t19 {
    int hours;
    int minutes;
    int seconds;
    public void displayTime() {
        System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);
    }
    public static void main(String[] args) {
        t19 clk1 = new t19();
        clk1.hours = 9;
        clk1.minutes = 5;
        clk1.seconds = 3;
        System.out.print("Время 1: ");
        clk1.displayTime();
        t19 clk2 = new t19();
        clk2.hours = 23;
        clk2.minutes = 59;
        clk2.seconds = 59;
        System.out.print("Время 2: ");
        clk2.displayTime();
    }
}