package Seminars.Lesson_5.com.example.uni.model.DB;

import java.util.ArrayList;
import java.util.List;

import Seminars.Lesson_5.com.example.uni.model.impl.Student;
import Seminars.Lesson_5.com.example.uni.model.impl.Teacher;
//симулирует базу данных
public class DataBase {
    public static final List<Student> studentsDB = new ArrayList<>();

    public static final List<Teacher> teachersDB = new ArrayList<>();

    public static void fillDB(){
        Teacher teacher = new Teacher(1, "Вася", "Иванов");
        teacher.addGroupId(1);
        teachersDB.add(teacher);
        Student s1 = new Student(1, "Рикон", "Старк", 1);
        Student s2 = new Student(2, "Джофри", "Ланистер", 1);
        studentsDB.add(s1);
        studentsDB.add(s2);
    }
}