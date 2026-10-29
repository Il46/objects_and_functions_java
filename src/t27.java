public class t27 {
    int orderNumber;
    String productName;
    double price;
    int quantity;
    public double calculateTotal() {
        return price * quantity;
    }
    public void changeQuantity(int newQuantity) {
        quantity = newQuantity;
        System.out.println("Заказ №" + orderNumber + ": количество изменено на " + quantity);
    }
    public static void main(String[] args) {
        t27 ord1 = new t27();
        ord1.orderNumber = 101;
        ord1.productName = "Ноутбук";
        ord1.price = 50000;
        ord1.quantity = 2;
        System.out.println("Итоговая стоимость заказа 101: " + ord1.calculateTotal() + " руб.");
        ord1.changeQuantity(3);
        System.out.println("Новая стоимость заказа 101: " + ord1.calculateTotal() + " руб.");
        t27 ord2 = new t27();
        ord2.orderNumber = 102;
        ord2.productName = "Мышь";
        ord2.price = 1500;
        ord2.quantity = 5;
        System.out.println("Итоговая стоимость заказа 102: " + ord2.calculateTotal() + " руб.");
    }
}