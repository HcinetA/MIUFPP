package Assignment4.prob2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Prof. John", 90000, LocalDate.of(2010, 1, 15), 10);
        Professor prof2 = new Professor("Prof. Jane", 95000, LocalDate.of(2012, 3, 10), 15);
        Professor prof3 = new Professor("Prof. Smith", 85000, LocalDate.of(2015, 5, 20), 8);
        Secretary sec1 = new Secretary("Sec. Anna", 50000, LocalDate.of(2018, 7, 25), 10);
        Secretary sec2 = new Secretary("Sec. Mary", 55000, LocalDate.of(2019, 9, 30), 15);

        DeptEmployee[] department = new DeptEmployee[5];
        department[0] = prof1;
        department[1] = prof2;
        department[2] = prof3;
        department[3] = sec1;
        department[4] = sec2;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you wish to see the sum of all Professor and Secretary salaries in the department? (Y/N): ");
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("Y")) {
            float totalSalary = 0;
            for (DeptEmployee emp : department) {
                totalSalary += emp.computeSalary();
            }
            float averageSalary = totalSalary / department.length;
            System.out.println("Total salary of all employees: " + totalSalary);
            System.out.println("Average salary of all employees: " + averageSalary);
        }
        scanner.close();
    }
}