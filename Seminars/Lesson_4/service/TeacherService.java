package Seminars.Lesson_4.service;

import Seminars.Lesson_4.model.Teatcher;

public class TeacherService {

    public Teatcher createTeacher(int id, String name, String lastName) {
        return new Teatcher(id, name, lastName);
    }

    public void updateTeacher(Teatcher teacher, String name, String lastName) {
        teacher.setName(name);
        teacher.setLastName(lastName);
    }

}