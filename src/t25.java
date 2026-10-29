public class t25 {
    String brand;
    int batteryLevel;
    boolean isOn;
    public void turnOn() {
        isOn = true;
        System.out.println(brand + " включен.");
    }
    public void turnOff() {
        isOn = false;
        System.out.println(brand + " выключен.");
    }
    public void useBattery(int amount) {
        if (!isOn) {
            System.out.println(brand + " выключен, нельзя использовать!");
            return;
        }
        batteryLevel -= amount;
        if (batteryLevel < 0) batteryLevel = 0;
        System.out.println(brand + " разрядился на " + amount + "%. Заряд: " + batteryLevel + "%");
    }
    public static void main(String[] args) {
        t25 ph1 = new t25();
        ph1.brand = "iPhone";
        ph1.batteryLevel = 100;
        ph1.turnOn();
        ph1.useBattery(20);
        t25 ph2 = new t25();
        ph2.brand = "Samsung";
        ph2.batteryLevel = 50;
        ph2.useBattery(10);
        ph2.turnOn();
        ph2.useBattery(30);
    }
}