package com.sidheswar.demo.Service;

import com.sidheswar.demo.Dao.StudentDao;
import com.sidheswar.demo.Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StudentService {

    private final StudentDao studentDao;

    @Autowired
    public StudentService(@Qualifier("fakeDao") StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public int addNewStudent(UUID studentId, Student newStudent){
        UUID studentUid = studentId == null? UUID.randomUUID() : studentId;
        newStudent.setId(studentUid);
        return studentDao.addNewStudent(studentUid, newStudent);
    }

    public Student getStudentById(UUID studentId){
        return studentDao.getStudentById(studentId);
    }

    public List<Student> getAllStudents(){
        return studentDao.getAllStudents();
    }

    public int updateStudentById(UUID studentId, Student updateStudent){
        return studentDao.updateStudentById(studentId,updateStudent);
    }

    public int deleteStudentById(UUID studentId){
        return studentDao.deleteStudentById(studentId);
    }
}
