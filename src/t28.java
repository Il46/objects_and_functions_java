public class t28 {
    String name;
    int health;
    int damage;
    public void attack(t28 target) {
        System.out.println(name + " атакует " + target.name + " и наносит " + damage + " урона!");
        target.takeDamage(damage);
    }
    public void takeDamage(int amount) {
        health -= amount;
        if (health < 0) health = 0;
        System.out.println(name + " получил урон. Оставшееся здоровье: " + health);
    }
    public static void main(String[] args) {
        t28 p1 = new t28();
        p1.name = "Воин";
        p1.health = 100;
        p1.damage = 30;
        t28 p2 = new t28();
        p2.name = "Маг";
        p2.health = 50;
        p2.damage = 40;
        p1.attack(p2);
        p2.attack(p1);
        p1.attack(p2);
    }
}