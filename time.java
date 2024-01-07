import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;

public class time {

    public static void main(String[] args) {

        LocalDateTime d01 = LocalDateTime.now();

        LocalDate d04 = LocalDate.parse("2024-01-04");
        LocalDateTime d05 = LocalDateTime.parse("2024-01-04T01:30:25");
        Instant d06 = Instant.parse("2024-01-04T01:30:25Z");

        LocalDate pastWeekLocaleDate = d04.minusDays(7);
        LocalDate nextWeekLocaleDate = d04.plusDays(7);

        System.out.println("data: " + d01);
        System.out.println("semana passada = " + pastWeekLocaleDate);
        System.out.println("próxima semana = " + nextWeekLocaleDate);

    }

}
