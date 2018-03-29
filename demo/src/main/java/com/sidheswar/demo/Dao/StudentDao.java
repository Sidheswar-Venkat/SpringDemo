package com.sidheswar.demo.Dao;

import com.sidheswar.demo.Model.Student;

import java.util.List;
import java.util.UUID;

public interface StudentDao {

    int addNewStudent(UUID studentId, Student newStudent);

    Student getStudentById(UUID studentId);

    List<Student> getAllStudents();

    int updateStudentById(UUID studentId, Student updateStudent);

    int deleteStudentById(UUID studentId);

    // intellija tip : ctrl+alt+L to format
}
