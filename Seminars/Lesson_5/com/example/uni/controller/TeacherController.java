package Seminars.Lesson_5.com.example.uni.controller;

import Seminars.Lesson_5.com.example.uni.model.impl.LearningGroup;
import Seminars.Lesson_5.com.example.uni.model.impl.Student;
import Seminars.Lesson_5.com.example.uni.model.impl.Teacher;
import Seminars.Lesson_5.com.example.uni.service.LearningGroupService;
import Seminars.Lesson_5.com.example.uni.service.StudentService;
import Seminars.Lesson_5.com.example.uni.service.TeacherService;

import java.util.List;

public class TeacherController {
    private final StudentService studentService;
    private final TeacherService teacherService;
    private final LearningGroupService learningGroupService;

    public TeacherController() {
        this.studentService = new StudentService();
        this.teacherService = new TeacherService();
        this.learningGroupService = new LearningGroupService();
    }

    public Student createStudent(String name, String lastName, int groupId) {
        return studentService.createStudent(name, lastName, groupId);
    }

    public Student getById(int id) {
        try {
            return studentService.getById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    public LearningGroup createLearningGroup(int teacherId, List<Integer> studentIds) {
        try {
            Teacher teacher = teacherService.getById(teacherId);
            List<Student> students = studentService.getByIds(studentIds);
            return learningGroupService.createLearningGroup(teacher, students);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}