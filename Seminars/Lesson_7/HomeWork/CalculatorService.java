package Seminars.Lesson_7.HomeWork;

import java.util.Scanner;

public class CalculatorService {
    private final Calculator calculator;
    private final CalculatorLogger logger;

    public CalculatorService() {
        this.calculator = new Calculator();
        this.logger = new CalculatorLogger();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите действительную часть первого комплексного числа:");
        double real1 = scanner.nextDouble();

        System.out.println("Введите мнимую часть первого комплексного числа:");
        double imaginary1 = scanner.nextDouble();

        ComplexNumber a = ComplexNumberFactory.create(real1, imaginary1);

        System.out.println("Введите действительную часть второго комплексного числа:");
        double real2 = scanner.nextDouble();

        System.out.println("Введите мнимую часть второго комплексного числа:");
        double imaginary2 = scanner.nextDouble();

        ComplexNumber b = ComplexNumberFactory.create(real2, imaginary2);

        System.out.println("Выберите операцию:");
        System.out.println("1. Сложение");
        System.out.println("2. Умножение");
        System.out.println("3. Деление");

        int operation = scanner.nextInt();

        switch (operation) {
            case 1:
                calculator.setOperation(new AdditionOperation());
                break;
            case 2:
                calculator.setOperation(new MultiplicationOperation());
                break;
            case 3:
                calculator.setOperation(new DivisionOperation());
                break;
            default:
                System.out.println("Неверная операция!");
                return;
        }

        ComplexNumber result = calculator.calculate(a, b);
        System.out.println("Результат: " + result);

        switch (operation) {
            case 1:
                logger.logOperation(a, b, result, "Сложение");
                break;
            case 2:
                logger.logOperation(a, b, result, "Умножение");
                break;
            case 3:
                logger.logOperation(a, b, result, "Деление");
                break;
        }
    }
}