package Seminars.Lesson_5.com.example.uni.service;

import Seminars.Lesson_5.com.example.uni.model.impl.LearningGroup;
import Seminars.Lesson_5.com.example.uni.model.impl.Student;
import Seminars.Lesson_5.com.example.uni.model.impl.Teacher;

import java.util.List;

public class LearningGroupService {
    public LearningGroup createLearningGroup(Teacher teacher, List<Student> students) {
        return new LearningGroup(teacher, students);
    }
}