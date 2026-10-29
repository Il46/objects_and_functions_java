public class t24 {
    String name;
    double averageGrade;
    public static void main(String[] args) {
        t24 st1 = new t24();
        st1.name = "Иван";
        st1.averageGrade = 4.2;
        t24 st2 = new t24();
        st2.name = "Мария";
        st2.averageGrade = 4.9;
        t24 st3 = new t24();
        st3.name = "Петр";
        st3.averageGrade = 3.8;
        t24 st4 = new t24();
        st4.name = "Анна";
        st4.averageGrade = 4.7;
        t24 st5 = new t24();
        st5.name = "Алексей";
        st5.averageGrade = 4.5;
        t24[] group = {st1, st2, st3, st4, st5};
        t24 best = group[0];
        for (int i = 1; i < group.length; i++) {
            if (group[i].averageGrade > best.averageGrade) {
                best = group[i];
            }
        }
        System.out.println("Студент с наибольшим средним баллом: " + best.name + " (" + best.averageGrade + ")");
    }
}