package Seminars.Lesson_5.com.example.uni.service;

import Seminars.Lesson_5.com.example.uni.model.DB.DataBase;
import Seminars.Lesson_5.com.example.uni.model.impl.Student;

import java.util.List;
import java.util.stream.Collectors;

public class StudentService {
    public Student createStudent(String name, String lastName, int groupId) {
        int id;
        int size = DataBase.studentsDB.size();
        if (size == 0) {
            id = 1;
        } else {
            id = size + 1;
        }
        Student student = new Student(id, name, lastName, groupId);
        DataBase.studentsDB.add(student);
        return student;
    }

    public Student getById(int id) throws Exception {
        Student student = DataBase.studentsDB
                .stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElse(null);
        if (student == null) {
            throw new Exception("Student not found");
        }
        return student;
    }

    public List<Student> getAllStudents() {
        return DataBase.studentsDB;
    }

    public List<Student> getByIds(List<Integer> ids) {
        return DataBase.studentsDB.stream()
                .filter(s -> ids.contains(s.getId()))
                .collect(Collectors.toList());
    }
}