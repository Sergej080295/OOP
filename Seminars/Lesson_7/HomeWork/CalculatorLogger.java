package Seminars.Lesson_7.HomeWork;

public class CalculatorLogger {
    public void logOperation(ComplexNumber a, ComplexNumber b, ComplexNumber result, String operation) {
        System.out.printf("LOG: Выполнена операция %s: %s %s %s = %s%n", operation, a, operation, b, result);
    }
}