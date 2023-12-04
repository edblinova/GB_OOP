package OOP;

import OOP.CalculatorModel;
import OOP.CalculatorView;

public class CalculatorController {

    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    public void runCalculator() {
        char operation = view.getUserOperation();
        model.setOperation(operation);
        double number1 = view.getUserNumber1();
        model.setNumber1(number1);
        double number2 = view.getUserNumber2();
        model.setNumber2(number2);
        double result = model.doMath();
        view.displayResult(result);
    }

}
