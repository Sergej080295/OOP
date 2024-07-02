package Seminars.Lesson_5.com.example.uni.view;

import Seminars.Lesson_5.com.example.uni.controller.StudentController;
import Seminars.Lesson_5.com.example.uni.model.impl.LearningGroup;
import Seminars.Lesson_5.com.example.uni.model.impl.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentView {
    private final StudentController controller;

    public StudentView(StudentController controller) {
        this.controller = controller;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1 - Создать студента");
            System.out.println("2 - Найти студента по id");
            System.out.println("3 - Вывести всех студентов");
            System.out.println("4 - Создать учебную группу");
            System.out.println("5 - Выход");

            switch (scanner.nextInt()) {
                case 1 -> createStudent();
                case 2 -> getById();
                case 3 -> getAllStudents();
                case 4 -> createLearningGroup();
                case 5 -> System.exit(0);
                default -> System.out.println("Операция не поддерживается");
            }
        }
    }

    private Student createStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию:");
        String lastName = scanner.nextLine();
        System.out.println("Введите номер группы:");
        int groupId = scanner.nextInt();
        return controller.createStudent(name, lastName, groupId);
    }

    private Student getById() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id пользователя: ");
        int id = scanner.nextInt();
        try {
            return controller.getById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    private List<Student> getAllStudents() {
        List<Student> students = controller.getAllStudents();
        for (Student student : students) {
            System.out.println(student);
        }
        return students;
    }

    private void createLearningGroup() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id преподавателя: ");
        int teacherId = scanner.nextInt();
    
        System.out.println("Введите количество студентов: ");
        int numStudents = scanner.nextInt();
        List<Integer> studentIds = new ArrayList<>();
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("Введите id студента %d: ", i + 1);
            int id = scanner.nextInt();
            studentIds.add(id);
        }

        try {
            LearningGroup learningGroup = controller.createLearningGroup(teacherId, studentIds);
            System.out.println(learningGroup);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}