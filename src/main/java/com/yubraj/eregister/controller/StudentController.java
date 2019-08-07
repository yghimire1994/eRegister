package com.yubraj.eregister.controller;

import com.yubraj.eregister.model.Student;
import com.yubraj.eregister.service.StudentService;
import jdk.nashorn.internal.runtime.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    StudentService service;

    @GetMapping(value = "/showCreateStudent")
    public String createStudent(){
        return "createStudentPage";
    }

    @PostMapping(value = "/savestudent")
    public String saveStudents(@ModelAttribute("student") Student student, ModelMap modelMap){
        Student studentSaved =service.saveStudent(student);
        String message = "Student saved with id" +studentSaved.getStudentId();
        modelMap.addAttribute("message", message);
        return "createStudentPage";
    }
    @GetMapping(value = "/displayStudents1")
    public String displayStudents(ModelMap modelMap) {
        List<Student> studentList = service.getAllStudent();
        modelMap.addAttribute("studentList", studentList);
        return "displayStudents1";
    }
        @GetMapping(value = "/editPages/{studentId}")
        public String showeditpage(@PathVariable("studentId") long studentId, ModelMap modelMap) {
            Student student = service.getStudentById(studentId);
            modelMap.addAttribute("student", student);
            return "editPage";
        }


        @PostMapping(value = "/saveupdatestudent")
        public String updateSTudent(@ModelAttribute("student") Student student, ModelMap modelMap){
                service.updateStudent(student);
                List<Student> studentList = service.getAllStudent();
                modelMap.addAttribute("studentList", studentList);
                return "displayStudents1";
        }

    @GetMapping(value = "/deletestudent/{studentId}")
    public String deleteLocation(@PathVariable("studentId") long studentId, ModelMap modelMap){
        Student student = service.getStudentById(studentId);
        service.deleteStudent(student);
        List<Student> studentList=service.getAllStudent();
        modelMap.addAttribute("studentList",studentList);
        return "displayStudents1";
    }

    }