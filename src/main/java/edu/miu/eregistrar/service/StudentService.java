package edu.miu.eregistrar.service;

import edu.miu.eregistrar.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
    Student getStudentById(Long studentId);
    void deleteStudentById(Long studentId);
    Student updateStudent(Student student);

    List<Student> searchStudent(String string);

}
