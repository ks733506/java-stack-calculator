# Stack Calculator

A Java-based command-line calculator that uses a stack data structure to perform arithmetic operations.

## Overview

This application implements a simple yet effective stack-based calculator where users can push values onto a stack and perform operations (add, subtract, multiply, divide) on those values. The calculator uses Java's built-in `Stack` class to manage numeric values.

## Features

- **Push Operation**: Push double values onto the stack
- **Arithmetic Operations**: 
  - `add` - Add the top two values
  - `sub` - Subtract the top two values
  - `mult` - Multiply the top two values
  - `div` - Divide the top two values (with zero-division protection)
- **Stack Management**:
  - `list` - Display all values currently in the stack
  - `clear` - Empty the stack
- **Error Handling**: Validates operations and prevents invalid calculations (e.g., division by zero)

## Project Structure

```
java-stack-calculator/
├── src/
│   ├── module-info.java              # Java module configuration
│   └── stackCalculator/
│       ├── StackCalculator.java      # Core stack calculator class
│       └── stackCalculatorApp.java   # Application entry point with CLI
└── bin/                              # Compiled class files
```

## Classes

### StackCalculator.java
The core calculator class that wraps Java's `Stack<Double>` and provides the following methods:
- `push(double value)` - Push a value onto the stack
- `pop()` - Pop and return the top value
- `size()` - Get the current stack size
- `listStack()` - Display all values in the stack
- `clearStack()` - Remove all values from the stack
- `setCommand(String cmd)` / `getLastCommand()` - Track the last command entered
- `displayWelcomeMessage()` - Show welcome text
- `displayCommands()` - Show available commands

### stackCalculatorApp.java
The main application class that provides the command-line interface:
- Implements the main loop that reads user commands
- Processes commands: push, add, sub, mult, div, list, clear, quit
- Validates input and handles errors gracefully

## Getting Started

### Requirements
- Java Development Kit (JDK) 9 or higher
- Any Java IDE (Eclipse, IntelliJ, etc.) or command-line compiler

### Compilation

**Using Eclipse:**
1. Import the project into Eclipse
2. The project will automatically compile

**Using Command Line:**
```bash
javac -d bin src/stackCalculator/*.java src/module-info.java
```

### Running the Application

**Using Eclipse:**
1. Right-click the project
2. Select "Run As" → "Java Application"
3. Select `stackCalculatorApp`

**Using Command Line:**
```bash
java -p bin -m stackCalculator
```

## Usage

Once the application starts, you'll see:
```
Welcome to the Stack Calculator.

Commands: push n, add, sub, mult, div, list, clear, or quit.

Stack> 
```

### Command Examples

**Push values:**
```
Stack> push 5
5.0
Stack> push 3
5.0
3.0
```

**Add operation:**
```
Stack> add
8.0
```

**Subtract operation:**
```
Stack> push 10
Stack> push 4
Stack> sub
6.0
```

**Multiply operation:**
```
Stack> push 3
Stack> push 7
Stack> mult
21.0
```

**Divide operation:**
```
Stack> push 20
Stack> push 4
Stack> div
5.0
```

**List stack:**
```
Stack> list
20.0
5.0
```

**Clear stack:**
```
Stack> clear
empty
```

**Quit the application:**
```
Stack> quit
Thanks for using the Stack Calculator.
```

## How It Works

The calculator follows the **Reverse Polish Notation (RPN)** principle, where:
1. Numbers are pushed onto a stack
2. Operations pop the required number of operands from the stack
3. The result is pushed back onto the stack
4. This eliminates the need for parentheses and follows a straightforward evaluation model

### Example: Calculate (5 + 3) * 2
```
Stack> push 5
5.0
Stack> push 3
5.0
3.0
Stack> add
8.0
Stack> push 2
8.0
2.0
Stack> mult
16.0
```

## Error Handling

- **Empty Stack Operations**: Attempting operations that require values will show an error
- **Division by Zero**: The calculator prevents division by zero and restores the stack to its original state
- **Invalid Commands**: Unknown commands display an "Unrecognized command" message
- **Missing Arguments**: Commands like `push` that require arguments will prompt for the correct usage

## Implementation Details

- **Data Structure**: Uses Java's built-in `java.util.Stack<Double>` class
- **Input Processing**: Uses `Scanner` to read user input and `String.split()` to parse commands
- **Double Precision**: All calculations use double-precision floating-point numbers
- **Module System**: Implements Java's module system for clean dependency management

## Author

Created by: ks733506

## License

This project is open source and available for educational purposes.

---

Enjoy using the Stack Calculator! For issues or suggestions, feel free to open an issue or submit a pull request.
