// Write your code here
package com.example.school.repository;

import java.util.*;
import com.example.school.model.Student;

public interface StudentRepository{
    ArrayList<Student> getAllStudents();

    Student getStudentById(int studentId);

    Student addStudent(Student stud);

    String addMultipleStudents(ArrayList<Student> students);

    Student updateStudent(int studentId, Student stud);

    void deleteStudent(int studentId);
}