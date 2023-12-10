package OOP;

import java.util.logging.Logger;

public class CalculatorController {

    private Logger logger;
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(Logger logger){
        this.logger = logger;
        this.model = new CalculatorModel();
        this.view = new CalculatorView();
    }

    public CalculatorController(Logger logger, CalculatorModel model, CalculatorView view) {
        this.logger = logger;
        this.model = model;
        this.view = view;
    }

    public void runCalculator() {
        char operation = view.getUserOperation();
        model.setOperation(operation);
        logger.info("Операция: " + model.getOperation());

        double a1 = view.getUserA1();
        double b1 = view.getUserB1();
        model.setNumber1(a1, b1);
        logger.info("Число 1: " + model.getNumber1().toString());

        double a2 = view.getUserA2();
        double b2 = view.getUserB2();
        model.setNumber2(a2, b2);
        logger.info("Число 2: " + model.getNumber2().toString());

        ComplexNumber result = model.doMath();
        view.displayResult(result);
        logger.info("Результат: " + result.toString());
    }

}
