package Seminars.Lesson_5.com.example.uni;

import Seminars.Lesson_5.com.example.uni.controller.StudentController;
import Seminars.Lesson_5.com.example.uni.model.DB.DataBase;
import Seminars.Lesson_5.com.example.uni.view.StudentView;

public class Main {
    public static void main(String[] args) {
        DataBase.fillDB();
        StudentController studentController = new StudentController();
        new StudentView(studentController).start();
    }
}