public class t9 {
    String name;
    String position;
    double salary;
    public void printInfo() {
        System.out.println("Сотрудник: " + name + ", Должность: " + position + ", Зарплата: " + salary + " руб.");
    }
    public static void main(String[] args) {
        t9 e1 = new t9();
        e1.name = "Алексей";
        e1.position = "Разработчик";
        e1.salary = 150000;
        e1.printInfo();
        t9 e2 = new t9();
        e2.name = "Ольга";
        e2.position = "Дизайнер";
        e2.salary = 120000;
        e2.printInfo();
    }
}