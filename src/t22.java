public class t22 {
    String owner;
    double balance;
    public void deposit(double amount) {
        balance += amount;
        System.out.println(owner + " пополнил счет на " + amount + ". Баланс: " + balance);
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(owner + " снял " + amount + ". Баланс: " + balance);
        } else {
            System.out.println("Недостаточно средств у " + owner);
        }
    }
    public static void main(String[] args) {
        t22 acc1 = new t22();
        acc1.owner = "Счёт А";
        acc1.balance = 5000;
        t22 acc2 = new t22();
        acc2.owner = "Счёт Б";
        acc2.balance = 10000;
        acc1.deposit(2000);
        acc2.withdraw(3000);
        System.out.println("Итоговый баланс Счёта А: " + acc1.balance);
        System.out.println("Итоговый баланс Счёта Б: " + acc2.balance);
    }
}