public class t3 {
    String title;
    String author;
    int pages;
    public void printInfo() {
        System.out.println("Книга: \"" + title + "\", Автор: " + author + ", Страниц: " + pages);
    }
    public static void main(String[] args) {
        t3 b1 = new t3();
        b1.title = "Война и мир";
        b1.author = "Лев Толстой";
        b1.pages = 1225;
        b1.printInfo();
        t3 b2 = new t3();
        b2.title = "Преступление и наказание";
        b2.author = "Федор Достоевский";
        b2.pages = 671;
        b2.printInfo();
    }
}