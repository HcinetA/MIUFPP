package a2Prob3;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class EventDetails {
    private String eventName;
    private LocalDateTime eventDateTime;
    private ZoneId systemTimeZone;

    public EventDetails(String eventName, LocalDateTime eventDateTime) {
        this.eventName = eventName;
        this.eventDateTime = eventDateTime;
        this.systemTimeZone = ZoneId.systemDefault();
    }

    public String getEventName() {
        return eventName;
    }

    public LocalDateTime getEventDateTime() {
        return eventDateTime;
    }

    public ZoneId getSystemTimeZone() {
        return systemTimeZone;
    }

    public void displayDayAndLeapYear() {
        DayOfWeek dayOfWeek = eventDateTime.toLocalDate().getDayOfWeek();
        boolean isLeapYear = eventDateTime.toLocalDate().isLeapYear();
        System.out.println("Day of the Week: " + dayOfWeek);
        System.out.println("Is Leap Year: " + (isLeapYear ? "Yes" : "No"));
    }

    public void calculateDaysToEvent() {
        LocalDate today = LocalDate.now();
        long daysToEvent = ChronoUnit.DAYS.between(today, eventDateTime.toLocalDate());
        System.out.println("Days to Event: " + daysToEvent + " days");
    }

    public void formatEventDetails() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy @ HH:mm z");
        ZonedDateTime zonedDateTime = eventDateTime.atZone(systemTimeZone);
        System.out.println("Event Date and Time: " + zonedDateTime.format(formatter));
    }

    public void convertTimeZone(String targetTimeZone) {
        try {
            ZoneId targetZoneId = ZoneId.of(targetTimeZone);
            ZonedDateTime targetZonedDateTime = eventDateTime.atZone(systemTimeZone).withZoneSameInstant(targetZoneId);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy @ HH:mm z");
            System.out.println("Converted Event Date and Time (" + targetTimeZone + "): " + targetZonedDateTime.format(formatter));
        } catch (DateTimeException e) {
            System.out.println("Invalid time zone: " + targetTimeZone);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter event name: ");
        String eventName = scanner.nextLine();

        System.out.print("Enter event date and time (yyyy-MM-dd HH:mm): ");
        String eventDateTimeInput = scanner.nextLine();
        LocalDateTime eventDateTime = LocalDateTime.parse(eventDateTimeInput, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));

        EventDetails eventDetails = new EventDetails(eventName, eventDateTime);

        eventDetails.displayDayAndLeapYear();

        eventDetails.calculateDaysToEvent();

        eventDetails.formatEventDetails();

        System.out.println("Enter a time zone to convert to (e.g., America/Chicago): ");
        String targetTimeZone = scanner.nextLine();
        eventDetails.convertTimeZone(targetTimeZone);

        scanner.close();
    }
}

