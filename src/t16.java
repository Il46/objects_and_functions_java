public class t16 {
    double celsius;
    public double toFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }
    public double toKelvin() {
        return celsius + 273.15;
    }
    public static void main(String[] args) {
        t16 tm1 = new t16();
        tm1.celsius = 25.0;
        System.out.println(tm1.celsius + "°C = " + tm1.toFahrenheit() + "°F, " + tm1.toKelvin() + "K");
        t16 tm2 = new t16();
        tm2.celsius = 0.0;
        System.out.println(tm2.celsius + "°C = " + tm2.toFahrenheit() + "°F, " + tm2.toKelvin() + "K");
    }
}