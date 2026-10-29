public class t20 {
    String flightNumber;
    String destination;
    int availableSeats;
    public void bookSeat() {
        if (availableSeats > 0) {
            availableSeats--;
            System.out.println("Место на рейс " + flightNumber + " в " + destination + " забронировано. Осталось мест: " + availableSeats);
        } else {
            System.out.println("На рейс " + flightNumber + " нет свободных мест!");
        }
    }
    public static void main(String[] args) {
        t20 fl1 = new t20();
        fl1.flightNumber = "SU-100";
        fl1.destination = "Москва";
        fl1.availableSeats = 1;
        fl1.bookSeat();
        fl1.bookSeat();
        t20 fl2 = new t20();
        fl2.flightNumber = "KC-881";
        fl2.destination = "Алматы";
        fl2.availableSeats = 2;
        fl2.bookSeat();
    }
}