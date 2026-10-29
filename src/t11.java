public class t11 {
    String owner;
    double balance;
    public void deposit(double amount) {
        balance += amount;
        System.out.println(owner + " пополнил счёт на " + amount + " руб. Текущий баланс: " + balance);
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(owner + " снял " + amount + " руб. Текущий баланс: " + balance);
        } else {
            System.out.println("Недостаточно средств у " + owner);
        }
    }
    public static void main(String[] args) {
        t11 a1 = new t11();
        a1.owner = "Сергей";
        a1.balance = 1000;
        a1.deposit(500);
        a1.withdraw(300);
        t11 a2 = new t11();
        a2.owner = "Мария";
        a2.balance = 2000;
        a2.withdraw(2500);
        a2.deposit(1000);
        a2.withdraw(2500);
    }
}