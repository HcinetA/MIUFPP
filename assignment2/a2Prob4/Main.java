package a2Prob4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;

        while (continueLoop) {
            System.out.println("Enter C for Circle");
            System.out.println("Enter R for Rectangle");
            System.out.println("Enter T for Triangle");
            String choice = scanner.next();

            switch (choice.toUpperCase()) {
                case "R" -> {
                    System.out.println("Enter the width of the Rectangle:");
                    double width = scanner.nextDouble();
                    System.out.println("Enter the height of the Rectangle:");
                    double height = scanner.nextDouble();
                    Rectangle rectangle = new Rectangle(width, height);
                    System.out.printf("The area of the Rectangle is: %.2f%n", rectangle.computeArea());
                }
                case "T" -> {
                    System.out.println("Enter the base of the Triangle:");
                    double base = scanner.nextDouble();
                    System.out.println("Enter the height of the Triangle:");
                    double height = scanner.nextDouble();
                    Triangle triangle = new Triangle(base, height);
                    System.out.printf("The area of the Triangle is: %.2f%n", triangle.computeArea());
                }
                case "C" -> {
                    System.out.println("Enter the radius of the Circle:");
                    double radius = scanner.nextDouble();
                    Circle circle = new Circle(radius);
                    System.out.printf("The area of the Circle is: %.2f%n", circle.computeArea());
                }
                default -> System.out.println("Invalid choice. Please enter R, T, or C.");
            }

            System.out.println("Do you want to continue (y/n):");
            String continueInput = scanner.next();
            continueLoop = continueInput.equalsIgnoreCase("y");
        }

        scanner.close();
    }
}

