package stackCalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackCalculator {
    private Stack<Double> calculator = new Stack<>();
    private String command = "";

    // Record the most recent command
    public void setCommand(String cmd) {
        this.command = cmd;
    }

    // Return the last command entered
    public String getLastCommand() {
        return command;
    }

    // Display welcome message
    public void displayWelcomeMessage() {
        System.out.println("Welcome to the Stack Calculator.");
    }

    // Display available commands
    public void displayCommands() {
        System.out.println("\nCommands: push n, add, sub, mult, div, list, clear, or quit.");
    }

    // Push a value onto the stack
    public void push(double value) {
        calculator.push(value);
    }

    // Pop the top value off the stack
    public Double pop() {
        if (calculator.isEmpty()) {
            System.out.println("Error: Stack is empty. Nothing to pop.");
            return null;
        }
        return calculator.pop();
    }

    // Return current size of the stack
    public int size() {
        return calculator.size();
    }

    // Return a copy of the stack contents as a List
    public List<Double> getValues() {
        return new ArrayList<>(calculator);
    }
    
    // List all values in the stack
    public void listStack() {
        if (calculator.isEmpty()) {
            System.out.println("empty");
        } else {
            for (Double d : calculator) {
                System.out.println(d);
            }
        }
    }

    // Clear the stack
    public void clearStack() {
        calculator.clear();
    }
}
