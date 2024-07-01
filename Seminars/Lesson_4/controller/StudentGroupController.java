package Seminars.Lesson_4.controller;

import Seminars.Lesson_4.model.Student;
import Seminars.Lesson_4.service.StudentGroupService;

public class StudentGroupController {

    private StudentGroupService service;

    public StudentGroupController(StudentGroupService service) {
        this.service = service;
    }

    public void addStudent(Student student) {
        service.addStudent(student);
    }

}