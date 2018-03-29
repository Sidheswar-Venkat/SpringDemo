package com.sidheswar.demo.Dao;

import com.sidheswar.demo.Model.Student;
import org.springframework.stereotype.Repository;

import java.util.*;

// dependency injection
@Repository("fakeDao")
public class FakeStudentDaoImpl implements StudentDao {

    private final Map<UUID, Student> database;

    public FakeStudentDaoImpl() {
        database = new HashMap<>();
        UUID studentId = UUID.randomUUID();
        database.put(
                studentId,
                new Student(studentId, 23, "Sidheswar", "Venkatachalapathi", "CSE"));
    }

    @Override
    public int addNewStudent(UUID studentId, Student newStudent) {
        database.put(studentId, newStudent);
        return 1;
    }

    @Override
    public Student getStudentById(UUID studentId) {
        return database.get(studentId);
    }

    @Override
    public List<Student> getAllStudents() {
        return new ArrayList<>(database.values());
    }

    @Override
    public int updateStudentById(UUID studentId, Student updateStudent) {
        database.put(studentId, updateStudent);
        return 1;
    }

    @Override
    public int deleteStudentById(UUID studentId) {
        database.remove(studentId);
        return 1;
    }
}
