package Seminars.Lesson_7.HomeWork;

public class MultiplicationOperation implements CalculatorOperation {
    @Override
    public ComplexNumber perform(ComplexNumber a, ComplexNumber b) {
        return a.multiply(b);
    }
}