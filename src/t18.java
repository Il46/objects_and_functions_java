public class t18 {
    String productName;
    double price;
    int quantity;
    public double calculateTotal() {
        return price * quantity;
    }
    public void setQuantity(int newQuantity) {
        quantity = newQuantity;
    }
    public static void main(String[] args) {
        t18 cart1 = new t18();
        cart1.productName = "Яблоки";
        cart1.price = 120;
        cart1.quantity = 3;
        System.out.println("Товар: " + cart1.productName + ", Сумма: " + cart1.calculateTotal() + " руб.");
        cart1.setQuantity(5);
        System.out.println("После изменения количества (" + cart1.quantity + "): " + cart1.calculateTotal() + " руб.");
        t18 cart2 = new t18();
        cart2.productName = "Молоко";
        cart2.price = 80;
        cart2.quantity = 2;
        System.out.println("Товар: " + cart2.productName + ", Сумма: " + cart2.calculateTotal() + " руб.");
    }
}