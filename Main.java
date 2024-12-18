public class Main {
    public static void main(String[] args) {
        boolean[][] schedule = new boolean[8][60];
        for (int i = 10; i<15; i++) schedule[2][i] = true;
        for (int i = 30; i<45; i++) schedule[2][i] = true;
        for (int i = 50; i<60; i++) schedule[2][i] = true;

        AppointmentBook book = new AppointmentBook(schedule);
        System.out.println(book.findFreeBlock(0, 0));
    }
}