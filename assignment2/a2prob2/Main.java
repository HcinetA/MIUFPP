package a2prob2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");

        System.out.print("Please, enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Please, enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Please, enter your birth date in the format-(yyyy-MM-dd)-Example 1989-4-14: ");
        String birthDateInput = scanner.nextLine();
        LocalDate birthDate = LocalDate.parse(birthDateInput, formatter);

        HeartRates person = new HeartRates(firstName, lastName, birthDate);

        System.out.println();
        person.calculateTargetHeartRateRange();
        System.out.println(person);
    }
}

