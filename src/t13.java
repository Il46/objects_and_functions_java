public class t13 {
    String name;
    int grade;
    public boolean hasPassed() {
        return grade >= 50;
    }
    public void printResult() {
        if (hasPassed()) {
            System.out.println("Студент " + name + " (оценка: " + grade + ") сдал экзамен.");
        } else {
            System.out.println("Студент " + name + " (оценка: " + grade + ") не сдал экзамен.");
        }
    }
    public static void main(String[] args) {
        t13 s1 = new t13();
        s1.name = "Дмитрий";
        s1.grade = 75;
        s1.printResult();
        t13 s2 = new t13();
        s2.name = "Елена";
        s2.grade = 42;
        s2.printResult();
    }
}