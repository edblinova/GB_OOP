package OOP;

import java.util.*;

public class CalculatorView {

    private Scanner scanner;

    public CalculatorView() {
        scanner = new Scanner(System.in);
    }

    public char getUserOperation() {
        System.out.println("Введите желаемую операцию (+,*,/): ");
        char operation = scanner.next().charAt(0);
        return operation;
    }

    public double getUserA1() {
        System.out.println("Введите реальную часть первого комплексного числа (дробная часть должна быть отделена запятой): ");
        scanner.useLocale(Locale.UK);
        double a1 = scanner.nextDouble();
        return a1;
    }

    public double getUserB1() {
        System.out.println("Введите мнимую часть первого комплексного числа (дробная часть должна быть отделена запятой): ");
        scanner.useLocale(Locale.UK);
        double b1 = scanner.nextDouble();
        return b1;
    }

    public double getUserA2() {
        System.out.println("Введите реальную часть второго комплексного числа (дробная часть должна быть отделена запятой): ");
        scanner.useLocale(Locale.UK);
        double a2 = scanner.nextDouble();
        return a2;
    }

    public double getUserB2() {
        System.out.println("Введите мнимую часть второго комплексного числа (дробная часть должна быть отделена запятой): ");
        scanner.useLocale(Locale.UK);
        double b2 = scanner.nextDouble();
        return b2;
    }

    public void displayResult(ComplexNumber result) {
        System.out.println("Результат вычислений = " + result.toString());
    }
}
