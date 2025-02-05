package com.itshaala;

public class ClassLoading1 {
    public static void main(String[] args) throws ClassNotFoundException {
//        Test test  = new Test();
        Class.forName("com.itshaala.Test");
    }
}
