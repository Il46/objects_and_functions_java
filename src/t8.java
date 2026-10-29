public class t8 {
    double radius;
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    public static void main(String[] args) {
        t8 c1 = new t8();
        c1.radius = 4.0;
        System.out.println("Круг 1 с радиусом " + c1.radius + ": Площадь = " + c1.calculateArea());
        t8 c2 = new t8();
        c2.radius = 2.5;
        System.out.println("Круг 2 с радиусом " + c2.radius + ": Площадь = " + c2.calculateArea());
    }
}