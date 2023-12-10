package OOP;

public class ComplexNumber {

    // реальная и мнимая части комплексного числа
    private double real;
    private double imaginary;

    // создание комплексного числа
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // вернуть реальную часть комплексного числа
    public double getReal() {
        return real;
    }

    // вернуть мнимую часть комплексного числа
    public double getImaginary() {
        return imaginary;
    }

    // перезапись метода вывода строки
    @Override
    public String toString() {
        if (imaginary < 0) {
            return real + " - " + Math.abs(imaginary) + " * i";
        } else {
            return real + " + " + imaginary + " * i";
        }
    }
}
