package com.itshaala.dao;

import com.itshaala.model.Student;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    static List<Student> studentList = new ArrayList<>();

    public void createStudent(Student student) {
        Workbook workbook = new HSSFWorkbook();
        Sheet sheet = workbook.createSheet();
        Row row = sheet.createRow(1);
        Cell cell = row.createCell(1);
        cell.setCellValue(student.getId());
        studentList.add(student);
    }

    public void updateStudent(Student student) {
        studentList.add(student);
    }

    public void deleteStudent(Student student) {
        studentList.remove(student);
    }

    public List<Student> getStudentList() {
        return studentList;
    }
}
