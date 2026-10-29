public class t1 {
    String name;
    int age;
    String group;
    public void printInfo() {
        System.out.println("Студент: " + name + ", Возраст: " + age + ", Группа: " + group);
    }
    public static void main(String[] args) {
        t1 s1 = new t1();
        s1.name = "Иван";
        s1.age = 20;
        s1.group = "ИТ-101";
        s1.printInfo();
        t1 s2 = new t1();
        s2.name = "Анна";
        s2.age = 19;
        s2.group = "ИТ-102";
        s2.printInfo();
    }
}