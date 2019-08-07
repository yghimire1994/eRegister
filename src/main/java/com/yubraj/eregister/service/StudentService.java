package com.yubraj.eregister.service;

import com.yubraj.eregister.model.Student;

import java.util.List;

public interface StudentService {
    Student saveStudent(Student student);
    Student updateStudent(Student student);
    void deleteStudent(Student studentId);
    Student getStudentById(long studentId);
    List<Student> getAllStudent();

}