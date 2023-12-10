package OOP;

public class CalculatorModel {

    private char operation;
    private ComplexNumber number1;
    private ComplexNumber number2;

    public CalculatorModel() {
        
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }
    
    public void setNumber1(double a1, double b1) {
        this.number1 = new ComplexNumber(a1, b1);
    }

    public void setNumber2(double a2, double b2) {
        this.number2 = new ComplexNumber(a2, b2);
    }

    public char getOperation() {
        return operation;
    }
    
    public ComplexNumber getNumber1() {
        return number1;
    }

    public ComplexNumber getNumber2() {
        return number2;
    }

    public ComplexNumber doMath() {
        ComplexOperations result = new ComplexOperations(number1, number2);
        switch (operation) {
            case '+':
                result.sumNumbers();
                break;
            case '*':
                result.multiplyNumbers();
                break;
            case '/':
                result.divisionNumbers();
                break;
        }
        return result.getResult();
    }
}
