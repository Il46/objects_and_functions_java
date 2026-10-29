public class t12 {
    String name;
    double price;
    int quantity;
    public double getTotalValue() {
        return price * quantity;
    }
    public static void main(String[] args) {
        t12 pr1 = new t12();
        pr1.name = "Монитор";
        pr1.price = 15000;
        pr1.quantity = 10;
        System.out.println("Товар: " + pr1.name + ", Общая стоимость: " + pr1.getTotalValue() + " руб.");
        t12 pr2 = new t12();
        pr2.name = "Клавиатура";
        pr2.price = 3000;
        pr2.quantity = 25;
        System.out.println("Товар: " + pr2.name + ", Общая стоимость: " + pr2.getTotalValue() + " руб.");
    }
}