package Seminars.Lesson_3;

// Создать класс Студент
// � Создать класс УчебнаяГруппа
// � Создать класс УчебнаяГруппаИтератор, заставив его реализовать
// интерфейс Iterator
// � Реализовать его контракты (включая удаление)

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Текущий список студентов
        Student van = new Student("Van", 4);
        Student igor = new Student("Igorechick", 1);
        Student alex = new Student("Alex", 2);
        Student alexey = new Student("Alexey", 3);
        Student sasha = new Student("Sasha", 5);
        Student maxim = new Student("Maxim", 6);

        // Создание 1й группы
        StudentGroup group1 = new StudentGroup();
        group1.addStudent(van);
        group1.addStudent(igor);
        group1.addStudent(alex);
        group1.addStudent(alexey);

        // Создание 2 группы
        StudentGroup group2 = new StudentGroup();
        group2.addStudent(sasha);
        group2.addStudent(maxim);

        // Создание потока
        Stream stream = new Stream();
        stream.addGroup(group1);
        stream.addGroup(group2);

        // Сортировка потоков
        List<Stream> streams = new ArrayList<>();
        streams.add(stream);
        StreamService.sortStreams(streams);

        // Вывод
        for (Stream s : streams) {
            System.out.println("Групп в потоке: " + s.groups.size());
            for (StudentGroup g : s) {
                System.out.println("  Группа: " + g.students);
            }
        }
    }
}