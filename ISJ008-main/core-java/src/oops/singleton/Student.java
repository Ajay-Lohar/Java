package oops.singleton;

import lombok.Getter;

class Student {

    @Getter
    private static Student student = new Student();

    private Student() {
    }

    public static Student getStudent() {
        return student;
    }
}