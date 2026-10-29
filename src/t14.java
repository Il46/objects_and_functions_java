public class t14 {
    int count;
    public void increment() {
        count++;
    }
    public void decrement() {
        count--;
    }
    public void reset() {
        count = 0;
    }
    public static void main(String[] args) {
        t14 cnt1 = new t14();
        cnt1.increment();
        cnt1.increment();
        System.out.println("Счётчик 1: " + cnt1.count);
        cnt1.decrement();
        System.out.println("Счётчик 1 после уменьшения: " + cnt1.count);
        cnt1.reset();
        System.out.println("Счётчик 1 после сброса: " + cnt1.count);
        t14 cnt2 = new t14();
        cnt2.increment();
        cnt2.increment();
        cnt2.increment();
        System.out.println("Счётчик 2: " + cnt2.count);
    }
}