package Seminars.Lesson_5.com.example.uni.controller;

import Seminars.Lesson_5.com.example.uni.model.DB.DataBase;
import Seminars.Lesson_5.com.example.uni.model.impl.LearningGroup;
import Seminars.Lesson_5.com.example.uni.model.impl.Student;
import Seminars.Lesson_5.com.example.uni.model.impl.Teacher;
import Seminars.Lesson_5.com.example.uni.service.LearningGroupService;
import Seminars.Lesson_5.com.example.uni.service.StudentService;
import Seminars.Lesson_5.com.example.uni.service.TeacherService;

import java.util.List;

public class StudentController {
    private final StudentService studentService;
    private final TeacherService teacherService;
    private final LearningGroupService learningGroupService;

    public StudentController() {
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
            
            // Обновляем groupId студентов, входящих в учебную группу
            for (Student student : students) {
                if (!teacher.getGroupIds().isEmpty()) {
                    student.setGroupId(teacher.getGroupIds().get(0)); // Используем первую группу преподавателя
                }
            }
            
            LearningGroup learningGroup = learningGroupService.createLearningGroup(teacher, students);
            
            // Добавляем студентов учебной группы в базу данных студентов
            for (Student student : students) {
                if (!DataBase.studentsDB.contains(student)) {
                    DataBase.studentsDB.add(student);
                }
            }
            
            return learningGroup;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}