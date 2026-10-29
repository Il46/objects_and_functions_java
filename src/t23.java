public class t23 {
    String title;
    String author;
    boolean isAvailable;
    public void checkOut() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Книга \"" + title + "\" успешно выдана.");
        } else {
            System.out.println("Книга \"" + title + "\" уже выдана!");
        }
    }
    public void returnBook() {
        isAvailable = true;
        System.out.println("Книга \"" + title + "\" возвращена в библиотеку.");
    }
    public static void main(String[] args) {
        t23 bk1 = new t23();
        bk1.title = "Мастер и Маргарита";
        bk1.author = "Михаил Булгаков";
        bk1.isAvailable = true;
        bk1.checkOut();
        bk1.checkOut();
        bk1.returnBook();
        bk1.checkOut();
        t23 bk2 = new t23();
        bk2.title = "1984";
        bk2.author = "Джордж Оруэлл";
        bk2.isAvailable = false;
        bk2.checkOut();
    }
}