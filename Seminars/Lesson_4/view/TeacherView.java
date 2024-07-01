package Seminars.Lesson_4.view;

import Seminars.Lesson_4.model.Teatcher;

import java.util.Collections;
import java.util.List;

public class TeacherView implements UserView<Teatcher> {

    @Override
    public void sendOnConsole(List<Teatcher> teachers) {
        Collections.sort(teachers);
        System.out.println(teachers);
    }

}