package Seminars.Lesson_7.HomeWork;

public class ComplexNumberFactory {
    public static ComplexNumber create(double real, double imaginary) {
        return new ComplexNumber(real, imaginary);
    }
}