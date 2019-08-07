package com.yubraj.eregister.service.serviceImplementation;

import com.yubraj.eregister.model.Student;
import com.yubraj.eregister.repository.StudentRepository;
import com.yubraj.eregister.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImplementation implements StudentService {

    @Autowired
    private StudentRepository repository;

    @Override
    public Student saveStudent(Student student) {
        return repository.save(student);    }

    @Override
    public Student updateStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public void deleteStudent(Student student) {
        repository.delete(student);

    }

    @Override
    public Student getStudentById(long studentId) {
        return repository.findById(studentId).orElse(null);
    }

    @Override
    public List<Student> getAllStudent() {

        return repository.findAll();
    }
}
