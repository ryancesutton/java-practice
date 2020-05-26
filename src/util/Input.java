package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);

    public String input;

    public String getString() {
        System.out.println("Type some stuff: ");
        input = scanner.nextLine();
        return input;
    }

    public boolean yesNo() {
        System.out.println("[yes/no]");
        input = scanner.nextLine();

        if (input.startsWith("y")){
            return true;
        }
        return false;
    }

    public int getInt(int min, int max){
        System.out.printf("Enter a number between %s and %s: ", min , max);
        int input = Integer.parseInt(scanner.nextLine());
        if (input < min || input > max){
            System.out.println("Not valid! Try again.");
            return getInt(min,max);
        }
            return input;
    }

    public int getInt() {
        System.out.println("Enter a number: ");
        input = scanner.nextLine();
        int userInput = Integer.parseInt(input);
        return userInput;
    }

    public double getDouble(double min, double max){
        System.out.printf("Enter a number between %s and %s: ", min , max);
        input = scanner.nextLine();
        double userInput = Double.parseDouble(input);
        if (userInput < min || userInput > max) {
            System.out.println("Invalid input, try again!");
            return getDouble(min, max);
        }
        return userInput;
    }

    public double getDouble() {
        System.out.println("Enter a number: ");
        input = scanner.nextLine();
        double userInput = Double.parseDouble(input);
        return userInput;
    }



}
