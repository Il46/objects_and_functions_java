public class t4 {
    String brand;
    String model;
    double price;
    public void printInfo() {
        System.out.println("Телефон: " + brand + " " + model + ", Цена: " + price + " руб.");
    }
    public static void main(String[] args) {
        t4 p1 = new t4();
        p1.brand = "Apple";
        p1.model = "iPhone 15";
        p1.price = 89990;
        p1.printInfo();
        t4 p2 = new t4();
        p2.brand = "Samsung";
        p2.model = "Galaxy S24";
        p2.price = 79990;
        p2.printInfo();
        t4 p3 = new t4();
        p3.brand = "Xiaomi";
        p3.model = "14 Pro";
        p3.price = 59990;
        p3.printInfo();
    }
}