package com.yubraj.eregister.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long studentId;
    @Column(nullable = false)
    private String studentNumber;
    @Column(nullable = false)
    private String FirstName;
    private String MiddleName;
    @Column(nullable = false)
    private String LastName;
    private float cgpa;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate enrollmentDate;
    @Column(nullable = false)
    private String isInternational;

    public Student(){
        super();
    }

    public Student(String studentNumber, String FirstName, String MiddleName, String LastName, float cgpa, LocalDate enrollmentDate, String isInternational) {
        this.studentNumber = studentNumber;
        this.FirstName = FirstName;
        this.MiddleName = MiddleName;
        this.LastName = LastName;
        this.cgpa = cgpa;
        this.enrollmentDate = enrollmentDate;
        this.isInternational = isInternational;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public void setMiddleName(String middleName) {
        MiddleName = middleName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public String getIsInternational() {
        return isInternational;
    }

    public void setIsInternational(String isInternational) {
        this.isInternational = isInternational;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentNumber='" + studentNumber + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", MiddleName='" + MiddleName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", cgpa=" + cgpa +
                ", enrollmentDate=" + enrollmentDate +
                ", isInternational='" + isInternational + '\'' +
                '}';
    }
}
