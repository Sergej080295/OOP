package Seminars.Lesson_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup> {
    public List<StudentGroup> groups;

    public Stream() {
        this.groups = new ArrayList<>();
    }

    public void addGroup(StudentGroup group) {
        this.groups.add(group);
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return this.groups.iterator();
    }
}