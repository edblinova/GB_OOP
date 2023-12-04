package OOP;

import java.util.*;

public class CalculatorView {

    private Scanner scanner;

    public CalculatorView() {
        scanner = new Scanner(System.in);
    }

    public char getUserOperation() {
        System.out.println("Введите желаемую операцию (+,-,*,/): ");
        char operation = scanner.next().charAt(0);
        return operation;
    }

    public double getUserNumber1() {
        System.out.println("Введите первое число (дробная часть должна быть отделена запятой): ");
        scanner.useLocale(Locale.UK);
        double number1 = scanner.nextDouble();
        return number1;
    }

    public double getUserNumber2() {
        System.out.println("Введите второе число (дробная часть должна быть отделена запятой): ");
        scanner.useLocale(Locale.UK);
        double number2 = scanner.nextDouble();
        return number2;
    }

    public void displayResult(double result) {
        System.out.println("Результат вычислений = " + result);
    }
}
