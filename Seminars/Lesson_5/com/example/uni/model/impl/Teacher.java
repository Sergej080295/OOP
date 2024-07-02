package Seminars.Lesson_5.com.example.uni.model.impl;

import java.util.ArrayList;
import java.util.List;

import Seminars.Lesson_5.com.example.uni.model.User;

public class Teacher extends User {
    private final List<Integer> groups = new ArrayList<>();

    public Teacher(int id, String name, String lastName) {
        super(id, name, lastName);
    }

    public void addGroupId(int id) {
        groups.add(id);
    }

    public List<Integer> getGroupIds() {
        return groups;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Teacher: id = ").append(id).append(", name = ").append(name).append(", lastName = ").append(lastName);
        sb.append(", groups: ");
        for (int groupId : groups) {
            sb.append(groupId).append(" ");
        }
        return sb.toString();
    }
}