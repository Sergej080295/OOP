package Seminars.Lesson_7.HomeWork;

public class AdditionOperation implements CalculatorOperation {
    @Override
    public ComplexNumber perform(ComplexNumber a, ComplexNumber b) {
        return a.add(b);
    }
}