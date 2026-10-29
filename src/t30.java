public class t30 {
    static class Student {
        String name;
        String group;
        public void printInfo() {
            System.out.println("Студент: " + name + ", Группа: " + group);
        }
    }
    static class Teacher {
        String name;
        String subject;
        public void printInfo() {
            System.out.println("Преподаватель: " + name + ", Предмет: " + subject);
        }
    }
    static class Course {
        String title;
        int hours;
        public void printInfo() {
            System.out.println("Курс: \"" + title + "\", Часов: " + hours);
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Иван";
        s1.group = "А-1";
        Student s2 = new Student();
        s2.name = "Мария";
        s2.group = "А-2";
        Teacher t1 = new Teacher();
        t1.name = "Пётр Петрович";
        t1.subject = "Программирование";
        Teacher t2 = new Teacher();
        t2.name = "Ольга Сергеевна";
        t2.subject = "Математика";
        Course c1 = new Course();
        c1.title = "Java для начинающих";
        c1.hours = 72;
        Course c2 = new Course();
        c2.title = "Высшая математика";
        c2.hours = 108;
        s1.printInfo();
        s2.printInfo();
        t1.printInfo();
        t2.printInfo();
        c1.printInfo();
        c2.printInfo();
    }
}