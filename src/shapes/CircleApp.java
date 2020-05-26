package shapes;

import java.util.Scanner;

public class CircleApp {

    public static void main(String[] args) {
        System.out.println("Enter a radius: ");
        Scanner scanner = new Scanner(System.in);
        double userInput = Double.parseDouble(scanner.nextLine());
        Circle circle = new Circle(userInput);
        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());
    }

}
