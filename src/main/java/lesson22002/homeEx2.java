package lesson22002;

    import java.time.*;

    public class homeEx2 {
        public static LocalTime calculateArrivalTime(LocalTime departureTime, Duration flightDuration) {
            // Установка часовых поясов для Лос-Анджелеса и Франкфурта
            ZoneId losAngelesZone = ZoneId.of("America/Los_Angeles");
            ZoneId frankfurtZone = ZoneId.of("Europe/Berlin");

            // Создание объекта ZonedDateTime для времени отправления
            ZonedDateTime departureDateTime = ZonedDateTime.of(LocalDate.now(), departureTime, losAngelesZone);

            // Добавление длительности полета для вычисления времени прибытия
            ZonedDateTime arrivalDateTime = departureDateTime.plus(flightDuration);

            // Конвертация времени прибытия во временную зону Франкфурта
            ZonedDateTime frankfurtArrivalDateTime = arrivalDateTime.withZoneSameInstant(frankfurtZone);

            // Получение времени прибытия из объекта ZonedDateTime
            LocalTime arrivalTime = frankfurtArrivalDateTime.toLocalTime();

            return arrivalTime;
        }

        public static void main(String[] args) {
            // Время отправления рейса из Лос-Анджелеса
            LocalTime departureTime = LocalTime.of(15, 5);

            // Длительность полета
            Duration flightDuration = Duration.ofHours(10).plusMinutes(50);

            // Вычисление времени прибытия
            LocalTime arrivalTime = calculateArrivalTime(departureTime, flightDuration);

            // Вывод времени прибытия на экран
            System.out.println("Время прибытия: " + arrivalTime);
        }
    }


