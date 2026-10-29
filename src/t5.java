public class t5 {
    String name;
    int age;
    public void meow() {
        System.out.println("Кошка " + name + " (возраст: " + age + ") говорит: Мяу!");
    }
    public static void main(String[] args) {
        t5 cat1 = new t5();
        cat1.name = "Барсик";
        cat1.age = 3;
        cat1.meow();
        t5 cat2 = new t5();
        cat2.name = "Мурка";
        cat2.age = 2;
        cat2.meow();
    }
}