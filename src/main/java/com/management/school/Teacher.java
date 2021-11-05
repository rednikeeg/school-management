package com.management.school;

import java.util.Set;
import java.util.TreeSet;

public class Teacher {
    private int id;
    private String name;
    private Set<String> subjects;

    public Teacher() {
        subjects = new TreeSet<>();
    }

    public Teacher(String name, Set<String> subjects) {
        this();
        this.name = name;
        addAll(subjects);
    }

    public Teacher(int id, String name, Set<String> subjects) {
        this(name, subjects);
        this.id = id;
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

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getSubjects() {
        return subjects;
    }

    public void add(String subject) {
        subjects.add(subject);
    }

    public void addAll(Set<String> subjects) {
        for (String s : subjects) {
            add(s);
        }
    }
}
