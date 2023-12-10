package OOP;

public class ComplexOperations implements OperationSum, OperationMultiply, OperationDivision {
    
    // инициализация класса Операций с комплексными числами
    private ComplexNumber number1;
    private ComplexNumber number2;
    public ComplexNumber result;

    // инициализация класса Операций с комплексными числами
    public ComplexOperations(ComplexNumber number1, ComplexNumber number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    // вернуть результат операции
    public ComplexNumber getResult() {
        return this.result;
    }

    // перезапись интерфейса Суммы
    @Override
    public void sumNumbers() {
        double a = this.number1.getReal() + this.number2.getReal();
        double b = this.number1.getImaginary() + this.number2.getImaginary();
        this.result = new ComplexNumber(a, b);
    }

    // перезапись интерфейса Умножения
    @Override
    public void multiplyNumbers() {
        double a = this.number1.getReal() * this.number2.getReal() - this.number1.getImaginary() * this.number2.getImaginary();
        double b = this.number1.getReal() * this.number2.getImaginary() + this.number1.getImaginary() * this.number2.getReal();
        this.result = new ComplexNumber(a, b);
    }
    
    // перезапись интерфейса Деления
    @Override
    public void divisionNumbers() {
        double denominator = this.number2.getReal() * this.number2.getReal() + this.number2.getImaginary() * this.number2.getImaginary();
        double a = (this.number1.getReal() * this.number2.getReal() + this.number1.getImaginary() * this.number2.getImaginary()) / denominator;
        double b = (this.number1.getImaginary() * this.number2.getReal() - this.number1.getReal() * this.number2.getImaginary()) / denominator;
        this.result = new ComplexNumber(a, b);
    }
}
