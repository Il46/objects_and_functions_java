public class t6 {
    String name;
    String breed;
    public void bark() {
        System.out.println("Собака " + name + " порода " + breed + " лает: Гав-гав!");
    }
    public static void main(String[] args) {
        t6 d1 = new t6();
        d1.name = "Шарик";
        d1.breed = "Овчарка";
        d1.bark();
        t6 d2 = new t6();
        d2.name = "Бобик";
        d2.breed = "Пудель";
        d2.bark();
    }
}