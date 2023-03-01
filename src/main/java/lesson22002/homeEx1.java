package lesson22002;

    import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.List;
    import java.util.stream.Collectors;

public class homeEx1 {
        public static void main(String[] args) {
            // Установка часового пояса CET
            ZoneId cetZone = ZoneId.of("CET");

            // Создание объекта LocalDate для первого дня февраля 2023
            LocalDate februaryFirst = LocalDate.of(2023, Month.FEBRUARY, 1);

            // Находим ближайший понедельник после 1 февраля 2023
            LocalDate firstMonday = februaryFirst.with(TemporalAdjusters.next(DayOfWeek.MONDAY));

            // Находим ближайшую среду после 1 февраля 2023
            LocalDate firstWednesday = februaryFirst.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));

            // Создание объекта LocalTime для времени начала занятий
            LocalTime startTime = LocalTime.of(9, 30);

            // Создание объекта ZonedDateTime для первого понедельника
            ZonedDateTime mondayDateTime = ZonedDateTime.of(firstMonday, startTime, cetZone);

            // Создание объекта ZonedDateTime для первой среды
            ZonedDateTime wednesdayDateTime = ZonedDateTime.of(firstWednesday, startTime, cetZone);

            // Создание объекта DateTimeFormatter для форматирования вывода даты и времени
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm z");

            // Печать списка дат и времени начала занятий
            System.out.println("Список дат и времени начала занятий:");
            System.out.println(mondayDateTime.format(formatter));
            System.out.println(wednesdayDateTime.format(formatter));

            // Повторяем для оставшихся понедельников и сред
            for (int i = 1; i < 4; i++) {
                mondayDateTime = mondayDateTime.plusWeeks(1);
                wednesdayDateTime = wednesdayDateTime.plusWeeks(1);
                System.out.println(mondayDateTime.format(formatter));
                System.out.println(wednesdayDateTime.format(formatter));

            }
    }}


