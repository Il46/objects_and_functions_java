public class t21 {
    String brand;
    String processor;
    int ram;
    double price;
    public void printSpecs() {
        System.out.println("Компьютер: " + brand + ", Процессор: " + processor + ", RAM: " + ram + "GB, Цена: " + price + " руб.");
    }
    public static void main(String[] args) {
        t21 cmp1 = new t21();
        cmp1.brand = "Dell";
        cmp1.processor = "Intel i7";
        cmp1.ram = 16;
        cmp1.price = 90000;
        cmp1.printSpecs();
        t21 cmp2 = new t21();
        cmp2.brand = "HP";
        cmp2.processor = "AMD Ryzen 5";
        cmp2.ram = 8;
        cmp2.price = 55000;
        cmp2.printSpecs();
        t21 cmp3 = new t21();
        cmp3.brand = "Apple";
        cmp3.processor = "M2";
        cmp3.ram = 16;
        cmp3.price = 130000;
        cmp3.printSpecs();
    }
}