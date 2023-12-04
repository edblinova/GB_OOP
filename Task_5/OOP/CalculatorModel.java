package OOP;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculatorModel {

    private char operation;
    private double number1;
    private double number2;

    public void setOperation(char operation) {
        this.operation = operation;
    }
    
    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public double doMath() {
        double result = 0.0;
        switch (operation) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '×':
                result = number1 * number2;
                break;
            case '÷':
                if (number2 == 0.0) {
                    throw new ArithmeticException("Деление на 0");
                }
                result = number1 / number2;
                break;
        }
        return result;
    }
}
