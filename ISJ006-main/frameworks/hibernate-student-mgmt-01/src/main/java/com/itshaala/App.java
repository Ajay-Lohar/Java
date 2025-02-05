package com.itshaala;

import com.itshaala.dao.StudentDao;
import com.itshaala.model.Student;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentId(2);
        student.setStudentName("Rahul G");
        student.setStudentEmail("rahul.g@itshaala.com");
        student.setStudentAddress("Pune Maharashtra");
        student.setStudentPhone("12345678");

        //StudentDao.addStudent(student);

        // StudentDao.updateStudent(student);

        //System.out.println(StudentDao.getStudentById(2));

        Student studentObjectToDelete = new Student();
        studentObjectToDelete.setStudentId(1);
        StudentDao.deleteStudent(studentObjectToDelete);

    }


}
