package Seminars.Lesson_5.com.example.uni.model.impl;

import java.util.List;

public class LearningGroup {
    private Teacher teacher;
    private List<Student> students;

    public LearningGroup(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Learning Group:\n");
        sb.append("Teacher: ").append(teacher).append("\n");
        sb.append("Students:\n");
        for (Student student : students) {
            sb.append("- ").append(student).append("\n");
        }
        return sb.toString();
    }
}