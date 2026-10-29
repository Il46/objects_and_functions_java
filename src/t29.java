public class t29 {
    String productName;
    int quantity;
    int capacity;
    public void addProduct(int amount) {
        if (quantity + amount <= capacity) {
            quantity += amount;
            System.out.println("Добавлено " + amount + " шт. " + productName + ". Всего: " + quantity);
        } else {
            System.out.println("Превышена вместимость склада для " + productName + "!");
        }
    }
    public void removeProduct(int amount) {
        if (amount <= quantity) {
            quantity -= amount;
            System.out.println("Удалено " + amount + " шт. " + productName + ". Остаток: " + quantity);
        } else {
            System.out.println("Нельзя удалить больше, чем есть на складе " + productName + "!");
        }
    }
    public static void main(String[] args) {
        t29 wh1 = new t29();
        wh1.productName = "Цемент";
        wh1.quantity = 50;
        wh1.capacity = 100;
        wh1.addProduct(40);
        wh1.addProduct(20);
        wh1.removeProduct(30);
        wh1.removeProduct(70);
        t29 wh2 = new t29();
        wh2.productName = "Песок";
        wh2.quantity = 10;
        wh2.capacity = 50;
        wh2.addProduct(30);
    }
}