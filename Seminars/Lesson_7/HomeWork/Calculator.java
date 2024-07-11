package Seminars.Lesson_7.HomeWork;

public class Calculator {
    private CalculatorOperation operation;

    public void setOperation(CalculatorOperation operation) {
        this.operation = operation;
    }

    public ComplexNumber calculate(ComplexNumber a, ComplexNumber b) {
        return operation.perform(a, b);
    }
}