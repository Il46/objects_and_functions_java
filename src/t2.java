public class t2 {
    String brand;
    String model;
    int year;
    public void printInfo() {
        System.out.println("Автомобиль: " + brand + " " + model + ", Год: " + year);
    }
    public static void main(String[] args) {
        t2 c1 = new t2();
        c1.brand = "Toyota";
        c1.model = "Camry";
        c1.year = 2020;
        c1.printInfo();
        t2 c2 = new t2();
        c2.brand = "BMW";
        c2.model = "X5";
        c2.year = 2022;
        c2.printInfo();
    }
}