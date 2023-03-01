package lesson22002;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class DateTime8ExamplePlusHome {
    public static void main(String[] args) {
//        Instant instant = Instant.now();
//        System.out.println(instant);
//        Instant instantbefor = Instant.now();
//long res= somemetod(5);
//        Instant instantafte = Instant.now();
//        Duration duration = Duration.between(instantafte, instantbefor);
//        System.out.println(duration.toMillis());
//        long start=System.currentTimeMillis();
//        long res= somemetod(5);
//        long end=System.currentTimeMillis();
//        System.out.println(end-+start);

//        instant= Instant.parse("2007-12-03T10:15:30.OOZ");
//        System.out.println(instant);
//        instant = Instant.parse("2023-02-22T10:39:52.919062800Z");
//        Instant newinct = instant.plus(1, ChronoUnit.DAYS);
//        System.out.println(newinct);
//        LocalDate localDate = LocalDate.now();
//        System.out.println(localDate);
//        LocalDate localDate1 = LocalDate.of(2023, 5, 22);
//        System.out.println(localDate1);
//        LocalDate localDate2 = localDate.plusMonths(2);
//        System.out.println(localDate2);
//        Period period = localDate1.until(localDate2);
//        System.out.println(period.getMonths());
//localDate.datesUntil(localDate2).forEach(System.out::println); //все даты в этот переиод
//        LocalTime localTime = LocalTime.now();
//        localDate.datesUntil(localDate2, Period.ofDays(7)).forEach(System.out::println); //все даты в  переиод через 7 дней
//        System.out.println(localDate2.getDayOfWeek());
//        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
//        //LocalDateTime.parse()//на основе strng
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        System.out.println(dateTimeFormatter.format(localDateTime));
//        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(Instant.now(), ZoneId.of("CET"));
//        System.out.println(zonedDateTime);
//        ZonedDateTime zonedDateTime2 = ZonedDateTime.ofInstant(Instant.now(), ZoneId.of("UTC"));
//        ZonedDateTime zonedDateTime3 = zonedDateTime.withZoneSameInstant(ZoneId.of("UTC"));
//        System.out.println(zonedDateTime2);
//        System.out.println(zonedDateTime3);
//ZoneId.getAvailableZoneIds().forEach(System.out::println); //зоны часовые пояса

//        1) создать дату своего рождения
//        - вывести на консоль на русском / английском языках
//        - найти, на какой день недели выпала дата рождения
//        - вычесть 10 лет из созданной даты, вывести на консоль
//        LocalDate bthDay = LocalDate.of(1964, 6, 4);
//        System.out.println(bthDay);
//        System.out.println(bthDay.getDayOfWeek());
//        LocalDate bd = bthDay.plusYears(-10);
//        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
//        System.out.println(dateTimeFormatter2.withLocale(FRANCE).format(bthDay));
        //  System.out.println(dateTimeFormatter.withLocale(Locale.GERMAN).format(bthDay));
        //  2) Найти дату последнего воскресенья марта 2023. Посчитать количество дней до него.
//       LocalDate llld=LocalDate.of(2023,4,1);
//LocalDate date1= llld.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));
//LocalDate date2= llld.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
//        System.out.println(date1);
//        System.out.println(date2);

//         LocalDate llld = LocalDate.of(2023, 3, 1);
//        System.out.println(llld);
//        LocalDate date1 = llld.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
//        System.out.println(date1);
//        Period period1 = llld.until(date1);
//        Period period2 = date1.until(LocalDate.now());
//        System.out.println(period1.getDays());
//        System.out.println(period2.getMonths());
//        System.out.println(period2.getDays());
//        LocalDate date2 = llld.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY)); // Последнее ВС месяца
//        System.out.println(date2); // 2023-04-30
//
//        LocalDate nowDate = LocalDate.now();
//        Period period3 = date2.until(nowDate);
//        System.out.println(period3); // P-2M-8D
//
//        LocalDate nowDate1 = LocalDate.now();
//        Period period4 = date2.until(nowDate);
//        System.out.println(period4);
//        3) Составить список времен начала всех занятий по Java на февраль, если предположить,
//                что они будут проходить каждый понедельник/среду c 9:30 CET.
        ZoneId cetZone = ZoneId.of("CET");
        LocalDate localDateFebruary = LocalDate.of(2023, 2, 1);
        LocalDate firstMonday = localDateFebruary.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        LocalDate firstWednesday = localDateFebruary.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
        LocalDate localDateFebruary2 = LocalDate.of(2023, 2, 28);
        LocalTime time = LocalTime.of(9, 30);
        ZonedDateTime mondayDateTime = ZonedDateTime.of(firstMonday, time, cetZone);
        LocalDateTime dataEndTime = LocalDateTime.of(localDateFebruary, time);
        LocalDateTime dataEndTime2 = LocalDateTime.of(localDateFebruary2, time);
       // System.out.println(firstMonday.datesUntil(localDateFebruary2, Period.ofDays(7)).collect(Collectors.toList()));//все даты в  переиод через 7 дней
        ZonedDateTime wednesdayDateTime = ZonedDateTime.of(firstWednesday, time, cetZone);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm z");

        System.out.println(mondayDateTime);
        System.out.println(wednesdayDateTime);
        System.out.println(mondayDateTime = mondayDateTime.plusDays(7));
        //все даты в  переиод через 7 дней
        System.out.println(wednesdayDateTime = wednesdayDateTime.plusDays(7));
        System.out.println(mondayDateTime = mondayDateTime.plusDays(7));
        //все даты в  переиод через 7 дней
        System.out.println(wednesdayDateTime = wednesdayDateTime.plusDays(7));
      // System.out.println(wednesdayDateTime = ZonedDateTime.parse(wednesdayDateTime.plusDays(7).format(formatter)));
        System.out.println(
                mondayDateTime =  mondayDateTime.plusDays(7));
        //все даты в  переиод через 7 дней
    //    System.out.println(wednesdayDateTime = wednesdayDateTime.plusDays(7));
      //  System.out.println(firstWednesday.datesUntil(localDateFebruary2, Period.ofDays(7)).collect(Collectors.toList()));


        // localDateFebruary.datesUntil(localDateFebruary2).forEach(System.out::println);
        // dataEndTime.until(dataEndTime2);
//        4)* Рейс из Лос-Анджелеса во Франкфурт отправляется в 15:05 по местному времени и длится 10 ч. 50 м.
//                Во сколько он прилетит? Написать метод, который мог бы совершать подобные вычисления.

    }


    public static int somemetod(long i) {
        if (i == 0) return 0;
        if (i == 1) return 1;
        return somemetod(-1) + somemetod(-2);
    }
}
