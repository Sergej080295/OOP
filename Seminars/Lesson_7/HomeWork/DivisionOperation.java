package Seminars.Lesson_7.HomeWork;

public class DivisionOperation implements CalculatorOperation {
    @Override
    public ComplexNumber perform(ComplexNumber a, ComplexNumber b) {
        return a.divide(b);
    }
}