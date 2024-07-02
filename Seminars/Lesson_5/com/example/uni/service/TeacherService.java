package Seminars.Lesson_5.com.example.uni.service;

import Seminars.Lesson_5.com.example.uni.model.DB.DataBase;
import Seminars.Lesson_5.com.example.uni.model.impl.Teacher;

public class TeacherService {
    public Teacher getById(int id) throws Exception {
        Teacher teacher = DataBase.teachersDB.stream()
                .filter(t -> t.getId() == id)
                .findFirst()
                .orElse(null);
        if (teacher == null) {
            throw new Exception("Teacher not found");
        }
        return teacher;
    }
}