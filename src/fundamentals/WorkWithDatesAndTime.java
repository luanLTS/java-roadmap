package fundamentals;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class WorkWithDatesAndTime {
    public static void dateTimeExample() {
        LocalDate today = LocalDate.now();
        System.out.println("Today : " + today);

        LocalTime thisTime = LocalTime.now();
        System.out.println("This time : " + thisTime);

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Time : " + currentDateTime);

        LocalDate someDay = LocalDate.of(2020, Month.JUNE, 12);
        System.out.println("Someday : " + someDay);

        LocalTime someTime = LocalTime.of(23, 53);
        System.out.println("Sometime : " + someTime);
        System.out.println("Sometime with seconds : " + LocalTime.of(23, 59, 59));

        LocalDateTime otherDateTime = LocalDateTime.of(2021, Month.MARCH, 4, 10, 51, 44);
        System.out.println("Other Date Time : " + otherDateTime);

    }

    public static void extractAndCombineDateTime() {

        LocalDate someDate = LocalDate.of(2025, Month.JANUARY, 7);
        System.out.println("Some date : " + someDate);

        LocalTime someTime = LocalTime.of(11, 17);
        System.out.println("Some time : " + someTime);

        System.out.println("Date combine w/ time : " + someDate.atTime(someTime));
        System.out.println("Time combine w/ date : " + someTime.atDate(someDate));
    }
}
