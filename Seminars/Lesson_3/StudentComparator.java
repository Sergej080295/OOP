package Seminars.Lesson_3;

// Создать класс СтудентКомпаратор реализующий интерфейс Comparator
// � Реализовать контракт compare () со сравнением по какому-либо параметру
// (пример: сочетание Имя+Фамилия)
// � Модифицировать класс УчебнаяГруппаСервис, добавив в него метод
// сортировки списка студентов по ФИО
// � Модифицировать класс Контроллер, добавив в него метод сортировки
// списка студентов по ФИО и вызывать в нем созданный метод из
// УчебнаяГруппаСервис

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.id - o2.id;
    }

}