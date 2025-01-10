https://chatgpt.com/share/6780855b-f540-8002-b493-d00ab9ed65c3
# Unit Testing with JUnit: Calculator Operations

This project demonstrates unit testing with JUnit for basic arithmetic operations using a `Calculator` class. The project focuses on writing and executing tests for edge cases, exception handling, and achieving reliable code quality.

## 📜 Project Overview
The `Calculator` class provides implementations for the following operations:
- **Addition** (`add`): Adds two integers.
- **Subtraction** (`subtract`): Subtracts one integer from another.
- **Multiplication** (`multiply`): Multiplies two integers.
- **Division** (`divide`): Divides one integer by another, with exception handling for division by zero.

Unit tests are written using JUnit 5, covering:
- Normal cases.
- Edge cases (e.g., negative numbers, zero).
- Exception handling scenarios.

## 📂 Project Structure
```
.
├── src
│   ├── main
│   │   └── java
│   │       └── Calculator.java       # Main implementation
│   └── test
│       └── java
│           └── CalculatorTest.java   # JUnit test cases
└── README.md                         # Documentation
```

## 🚀 Calculator Class Description
### 1. Addition
Adds two integers and returns the result.
```java
public int add(int a, int b) {
    return a + b;
}
```

### 2. Subtraction
Subtracts the second integer from the first and returns the result.
```java
public int subtract(int a, int b) {
    return a - b;
}
```

### 3. Multiplication
Multiplies two integers and returns the result.
```java
public int multiply(int a, int b) {
    return a * b;
}
```

### 4. Division
Divides the first integer by the second and returns the result. Throws an exception if the divisor is zero.
```java
public int divide(int a, int b) {
    if (b == 0) {
        throw new IllegalArgumentException("Cannot divide by zero");
    }
    return a / b;
}
```

## ✅ Testing with JUnit
JUnit test cases are written to validate each method with various inputs.

### Example Test Cases
```java
import com.example.mavenproject1.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(-2, 1));
    }

    @Test
    void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2));
        assertEquals(-3, calculator.subtract(-2, 1));
    }

    @Test
    void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(-2, calculator.multiply(-1, 2));
    }

    @Test
    void testDivide() {
        assertEquals(2, calculator.divide(6, 3));
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));
    }
}
```

### Test Coverage
Tests include:
- Valid inputs: Positive, negative, and zero.
- Invalid inputs: Division by zero (handled with an exception).
- Boundary cases: Large integers.

## 📊 Measuring Test Coverage
Measuring test coverage ensures that all critical paths of the code are tested.

### Tools
- **Jacoco**: A Maven plugin for measuring code coverage.
- **IntelliJ IDEA**: Built-in coverage analysis tools.

### Steps to Measure Coverage in IntelliJ
1. Right-click `CalculatorTest.java` and select **Run with Coverage**.
2. View the coverage report:
   - **Green**: Code executed during tests.
   - **Red**: Code not executed.

### Achieving 100% Coverage
To achieve full coverage:
- Test both normal and edge cases.
- Include checks for exception handling and invalid inputs.

Example:
```java
@Test
public void testDivideEdgeCase() {
    assertThrows(IllegalArgumentException.class, () -> {
        calculator.divide(10, 0);
    });
}
```

## ⚙️ How to Run the Project
### Prerequisites
- **Java 8+**
- **JUnit 5**
- **IDE** (IntelliJ IDEA, Eclipse) or **Maven**.

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/Son-Tung/kiem-thu-don-vi-java.git
   ```
2. Open the project in your IDE.
3. Run the test cases:
   - IntelliJ: Right-click `CalculatorTest` → Run Tests.
   - Maven: Run `mvn test`.

## 📈 Expected Output
- **JUnit Results**: All test cases pass.
- **Coverage Report**:
  - Statement Coverage: 100%.
  - Branch Coverage: 100%.

## 🔗 Resources
- [JUnit 5 Documentation](https://junit.org/junit5/docs/current/user-guide/)
- [Jacoco Coverage Plugin](https://www.jacoco.org/jacoco/)
- [EclEmma Plugin for Eclipse](https://www.eclipse.org/eclemma/)

---

🖋 **Author**
- **Name**: Nguyen Son Tung
- **GitHub**: [Son-Tung](https://github.com/Son-Tung)

Feel free to contribute or open issues for improvement!
