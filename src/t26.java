public class t26 {
    String brand;
    double mileage;
    double fuel;
    public void drive(double distance, double fuelConsumption) {
        if (fuel >= fuelConsumption) {
            mileage += distance;
            fuel -= fuelConsumption;
            System.out.println(brand + " проехал " + distance + " км. Пробег: " + mileage + " км, Топливо: " + fuel + " л.");
        } else {
            System.out.println(brand + ": недостаточно топлива для поездки!");
        }
    }
    public static void main(String[] args) {
        t26 car1 = new t26();
        car1.brand = "Audi";
        car1.mileage = 50000;
        car1.fuel = 30;
        car1.drive(100, 8);
        t26 car2 = new t26();
        car2.brand = "Honda";
        car2.mileage = 120000;
        car2.fuel = 5;
        car2.drive(100, 10);
    }
}