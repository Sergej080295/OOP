package Seminars.Lesson_5.com.example.uni.model.impl;

import Seminars.Lesson_5.com.example.uni.model.User;

public class Student extends User {

    int groupId;

    public Student(int id, String name, String lastName, int groupId) {
        super(id, name, lastName);
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return String.format("Student: id = %s, name = %s, lastName = %s, groupId = %s", id, name, lastName, groupId);
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

}