package com.management.school;

public class Student implements Comparable<Student> {
    private int id;
    private final String name;
    private Group group;

    public Student(Student student) {
        id = student.id;
        name = student.name;
        group = student.group;
    }

    public Student(String name, Group group) {
        this.name = name;
        this.group = group;
    }

    public Student(int id, String name, Group group) {
        this.id = id;
        this.name = name;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public int compareTo(Student student) {
        return name.compareTo(student.name);
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (!(object instanceof Student)) {
            return false;
        }

        Student student = (Student) object;

        return name.equals(student.name) && group.equals(student.group);
    }
}
