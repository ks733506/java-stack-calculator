package stackCalculator;

import java.util.List;
import java.util.Scanner;

public class stackCalculatorApp {

    public static void main(String[] args) {
    	// Make an instance of the StackCalculator class
        StackCalculator calc = new StackCalculator();
        Scanner scanner = new Scanner(System.in);

        calc.displayWelcomeMessage();
        calc.displayCommands();

        while (true) {
            System.out.print("\nStack> ");
            String choice = scanner.nextLine().trim().toLowerCase();
            String[] parts = choice.split(" ");

            String command = parts[0];       // first word of input
            calc.setCommand(command);        // record last command
            // Get the extra input value if provided (e.g., "push 5"); otherwise set to null
            String arg = (parts.length > 1) ? parts[1] : null;  

            if (command.equals("push")) {
                if (arg != null) {
                    double value = Double.parseDouble(arg);
                    calc.push(value);
                    calc.listStack();
                } else {
                    System.out.println("Missing number. Use: push n");
                }

            } else if (command.equals("add")) {
                if (calc.size() < 2) {
                    System.out.println("Error: At least two values are needed to perform add.");
                } else {
                    double a = calc.pop();
                    double b = calc.pop();
                    calc.push(a + b);
                    calc.listStack();
                }

            } else if (command.equals("sub")) {
                if (calc.size() < 2) {
                    System.out.println("Error: At least two values are needed to perform sub.");
                } else {
                    double a = calc.pop();
                    double b = calc.pop();
                    calc.push(a - b);
                    calc.listStack();
                }

            } else if (command.equals("mult")) {
                if (calc.size() < 2) {
                    System.out.println("Error: At least two values are needed to perform mult.");
                } else {
                    double a = calc.pop();
                    double b = calc.pop();
                    calc.push(a * b);
                    calc.listStack();
                }

            } else if (command.equals("div")) {
                if (calc.size() < 2) {
                    System.out.println("Error: At least two values are needed to perform div.");
                } else {
                    double a = calc.pop();   // divisor
                    double b = calc.pop();   // dividend
                    if (a == 0) {
                        System.out.println("Error: Cannot divide by zero.");
                        // restore stack in original order if division fails
                        calc.push(b);
                        calc.push(a);
                    } else {
                        calc.push(b / a);
                        calc.listStack();
                    }
                }

            } else if (command.equals("clear")) {
                calc.clearStack();
                calc.listStack();

            } else if (command.equals("list")) {
                List<Double> values = calc.getValues();
                if (values.isEmpty()) {
                    System.out.println("empty");
                } else {
                    for (Double d : values) {
                        System.out.println(d);
                    }
                }

            } else if (command.equals("quit")) {
                break;

            } else {
                System.out.println("Unrecognized command.");
            }
        }
        System.out.println("\nThanks for using the Stack Calculator.");
        scanner.close();
    }
}
