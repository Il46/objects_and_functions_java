public class t17 {
    double x;
    double y;
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }
    public static void main(String[] args) {
        t17 pt1 = new t17();
        pt1.x = 3.0;
        pt1.y = 4.0;
        System.out.println("Расстояние от точки (3, 4) до начала координат: " + pt1.distanceFromOrigin());
        t17 pt2 = new t17();
        pt2.x = 6.0;
        pt2.y = 8.0;
        System.out.println("Расстояние от точки (6, 8) до начала координат: " + pt2.distanceFromOrigin());
    }
}