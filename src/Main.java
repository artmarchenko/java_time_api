import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.parse("2019-06-01");
        LocalDate date2 = LocalDate.parse("2019-06-23");
        long days = ChronoUnit.DAYS.between(date1,date2);
        System.out.println(days);


    }
}
