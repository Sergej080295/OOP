package Seminars.Lesson_5.com.example.uni.controller;

import java.util.List;

import Seminars.Lesson_5.com.example.uni.model.impl.Student;
import Seminars.Lesson_5.com.example.uni.service.StudentService;

public class StudentController {

    private StudentService service = new StudentService();

    public Student createStudent(String name, String lastName, int idgroup) {
        return service.createStudent(name, lastName, idgroup);

    }

    public Student getById(int id) {

        Student student = null;
        try {
            student = service.getById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return student;
    }

    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }
}