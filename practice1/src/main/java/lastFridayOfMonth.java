import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class lastFridayOfMonth {
    public static void main(String[] args) {
        int year = 2024; // Specify the year you want to find the last Friday for
        for (int month = 1; month <= 12; month++) {
            LocalDate lastDayOfMonth=LocalDate.of(2024,month,1).with(TemporalAdjusters.lastDayOfMonth());
            LocalDate friday =lastDayOfMonth.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));
            System.out.println(friday);
        }
    }
}