package Seminars.Lesson_4.controller;

import Seminars.Lesson_4.model.Teatcher;
import Seminars.Lesson_4.model.User;
import Seminars.Lesson_4.service.TeacherService;
import Seminars.Lesson_4.view.TeacherView;

import java.util.ArrayList;
import java.util.List;

public class TeacherController implements UserController {

    private TeacherService teacherService;
    private TeacherView teacherView;
    private List<Teatcher> teachers;

    public TeacherController() {
        teacherService = new TeacherService();
        teacherView = new TeacherView();
        teachers = new ArrayList<>();
    }

    @Override
    public <T extends User> User create(T user) {
        if (user instanceof Teatcher) {
            Teatcher teacher = (Teatcher) user;
            teachers.add(teacher);
            return teacher;
        }
        return null;
    }

    public void updateTeacher(Teatcher teacher, String name, String lastName) {
        teacherService.updateTeacher(teacher, name, lastName);
    }

    public void sendTeachersToConsole() {
        teacherView.sendOnConsole(teachers);
    }

}