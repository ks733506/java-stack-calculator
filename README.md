# Stack Calculator

A Java-based calculator implementation using stack data structure to evaluate mathematical expressions.

## Project Overview

This project demonstrates the implementation of a stack-based calculator that efficiently processes arithmetic operations using the stack data structure. It supports common mathematical operations and follows postfix notation (Reverse Polish Notation) or infix notation evaluation.

## Features

- **Stack Implementation**: Custom stack data structure implementation
- **Expression Evaluation**: Evaluate mathematical expressions using stack-based algorithms
- **Arithmetic Operations**: Support for basic operations (+, -, *, /)
- **User-Friendly Interface**: Simple command-line interface for calculator operations

## Project Structure

```
java-stack-calculator/
├── src/
│   ├── module-info.java       # Java module configuration
│   └── stackCalculator/        # Main package
│       ├── Stack.java          # Stack data structure implementation
│       ├── Calculator.java     # Calculator logic and expression evaluation
│       └── Main.java           # Entry point and CLI
├── bin/                        # Compiled class files
├── .classpath                  # Eclipse classpath configuration
└── .project                    # Eclipse project configuration
```

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 9 or higher (for module support)
- Eclipse IDE or any Java compiler

### Compilation

Using Eclipse IDE:
1. Import the project into Eclipse
2. The project will automatically compile

Using command line:
```bash
javac -d bin src/stackCalculator/*.java src/module-info.java
```

### Running the Application

Using Eclipse:
1. Right-click the project
2. Select "Run As" → "Java Application"
3. Choose the Main class

Using command line:
```bash
java -p bin -m stackCalculator
```

## Usage

1. Launch the application
2. Enter mathematical expressions as prompted
3. View the calculated results
4. Exit the program

### Example

```
Enter expression: 5 3 +
Result: 8

Enter expression: 10 2 /
Result: 5
```

## Implementation Details

### Stack Class

The `Stack` class provides the core data structure with standard operations:
- `push(element)`: Add element to stack
- `pop()`: Remove and return top element
- `peek()`: View top element without removing
- `isEmpty()`: Check if stack is empty
- `size()`: Get current stack size

### Calculator Class

The `Calculator` class handles:
- Expression parsing
- Operation precedence
- Stack-based evaluation
- Error handling for invalid expressions

## Technologies Used

- **Language**: Java
- **Build System**: Eclipse IDE
- **JDK Version**: 9+ (Module System)

## Learning Objectives

This project demonstrates:
- Stack data structure implementation and usage
- Expression evaluation algorithms
- Object-oriented programming principles
- Java module system basics

## Future Enhancements

- [ ] Support for parentheses in expressions
- [ ] Additional mathematical functions (sqrt, power, etc.)
- [ ] GUI interface
- [ ] Expression history
- [ ] Input validation and error messages

## Author

Created by: ks733506

## License

This project is open source and available for educational purposes.

## Notes

- Ensure proper input format when entering expressions
- Division by zero will result in an error
- The calculator maintains precision for decimal operations

---

For questions or contributions, feel free to open an issue or pull request!
