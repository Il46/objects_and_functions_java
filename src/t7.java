public class t7 {
    double width;
    double height;
    public double calculateArea() {
        return width * height;
    }
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
    public static void main(String[] args) {
        t7 r1 = new t7();
        r1.width = 5.0;
        r1.height = 10.0;
        System.out.println("Прямоугольник 1: Площадь = " + r1.calculateArea() + ", Периметр = " + r1.calculatePerimeter());
        t7 r2 = new t7();
        r2.width = 3.5;
        r2.height = 7.0;
        System.out.println("Прямоугольник 2: Площадь = " + r2.calculateArea() + ", Периметр = " + r2.calculatePerimeter());
    }
}