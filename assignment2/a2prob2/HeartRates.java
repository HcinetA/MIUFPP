package a2prob2;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class HeartRates {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private final int  RESTING_HEART_RATE = 70;
    private final double LOWER_BOUNDARY = 0.5;
    private final double UPPER_BOUNDARY = 0.85;


    public HeartRates(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }


    public int calculateAge() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public int calculateMaximumHeartRate() {
        return 220 - calculateAge();
    }

    public void calculateTargetHeartRateRange() {
        int maxHeartRate = calculateMaximumHeartRate();
        int averageHeartRate = maxHeartRate - RESTING_HEART_RATE;
        double lowerBoundaryTargetHeartRate = (averageHeartRate * LOWER_BOUNDARY) + RESTING_HEART_RATE;
        double upperBoundaryTargetHeartRate = (averageHeartRate * UPPER_BOUNDARY) + RESTING_HEART_RATE;

        System.out.printf("The Target Heart Rate Range is between %.1f and %.1f%n",
                lowerBoundaryTargetHeartRate, upperBoundaryTargetHeartRate);
    }


    public String toString() {
        return String.format("First Name: %s%nLast Name: %s%nDate of Birth: %s%nAge: %d%nMaximum Heart Rate: %d",
                firstName, lastName, birthDate, calculateAge(), calculateMaximumHeartRate());
    }
}
