public class t10 {
    String brand;
    int ram;
    double price;
    public static void main(String[] args) {
        t10 l1 = new t10();
        l1.brand = "ASUS";
        l1.ram = 16;
        l1.price = 75000;
        t10 l2 = new t10();
        l2.brand = "Lenovo";
        l2.ram = 8;
        l2.price = 45000;
        System.out.println("Ноутбук 1: " + l1.brand + ", RAM: " + l1.ram + "GB, Цена: " + l1.price);
        System.out.println("Ноутбук 2: " + l2.brand + ", RAM: " + l2.ram + "GB, Цена: " + l2.price);
        if (l1.price > l2.price) {
            System.out.println("Ноутбук " + l1.brand + " дороже, чем " + l2.brand);
        } else if (l1.price < l2.price) {
            System.out.println("Ноутбук " + l2.brand + " дороже, чем " + l1.brand);
        } else {
            System.out.println("Ноутбуки стоят одинаково");
        }
    }
}