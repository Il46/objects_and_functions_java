public class t15 {
    String title;
    String genre;
    int duration;
    public void printSingleLine() {
        System.out.println("Фильм: \"" + title + "\", Жанр: " + genre + ", Длительность: " + duration + " мин.");
    }
    public static void main(String[] args) {
        t15 m1 = new t15();
        m1.title = "Интерстеллар";
        m1.genre = "Фантастика";
        m1.duration = 169;
        m1.printSingleLine();
        t15 m2 = new t15();
        m2.title = "Начало";
        m2.genre = "Боевик";
        m2.duration = 148;
        m2.printSingleLine();
    }
}