import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {


        Instant d01 = Instant.now();
        LocalDateTime r1 = LocalDateTime.ofInstant(d01, ZoneId.of("America/Sao_Paulo"));

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");


        LocalDateTime r2 = LocalDateTime.ofInstant(d01, ZoneId.of("America/Sao_Paulo"));
        System.out.println("Hora = " + r2.getHour());
        System.out.println("Minutos = " + r2.getMinute());
        System.out.println("Segundos = " + r2.getSecond());

        System.out.println("Past Week = " + r2.minusDays(7).format(fmt1));
        System.out.println("Next Week = " + r2.plusDays(7).format(fmt1));

        Instant pastWeekInstant = d01.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d01.plus(7, ChronoUnit.DAYS);

        System.out.println("Past Week Instant = " + pastWeekInstant);
        System.out.println("Next Week Instant = " + nextWeekInstant);

        Duration t1 = Duration.between(pastWeekInstant, nextWeekInstant);
        System.out.println(t1.toDays());

    }
}