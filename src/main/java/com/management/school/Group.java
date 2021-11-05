package com.management.school;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Group {
    private static final int MAX_AMOUNT = 30;
    private int id;
    private int year;
    private String name;
    private Set<Student> students;
    private Map<String, Teacher> subjects;

    private Group() {
        students = new TreeSet<>();
        subjects = new TreeMap<>();
    }

    public Group(int year, String name) {
        this();
        this.year = year;
        this.name = name;
    }

    public Group(int year, String name, Set<Student> students) {
        this(year, name);
        addAll(students);
    }

    public Group(int id, int year, String name, Set<Student> students) {
        this(year, name, students);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add(Student student) {
        if (size() == MAX_AMOUNT) {
            throw new IllegalArgumentException("Size was higher than " + MAX_AMOUNT);
        }

        students.add(student);
    }

    public void add(String subject, Teacher teacher) {
        subjects.put(subject, teacher);
    }

    public void addAll(Set<Student> students) {
        for (Student s : students) {
            add(s);
        }
    }

    public void addAll(Map<String, Teacher> subjects) {
        for (String s : subjects.keySet()) {
            add(s, subjects.get(s));
        }
    }

    public int size() {
        return students.size();
    }
}
