package com.sidheswar.demo.Controller;

import com.sidheswar.demo.Model.Student;
import com.sidheswar.demo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/students")
public class studentController {

    private final StudentService studentService;

    @Autowired
    public studentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping(
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @RequestMapping(
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE,
            path = "{studentId}"
    )
    public Student getStudentById(@PathVariable("studentId") UUID studentId){
        return studentService.getStudentById(studentId);
    }

    @RequestMapping(
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public int addNewStudent(@RequestBody Student student){
        return studentService.addNewStudent(UUID.randomUUID(), student);
    }

    @RequestMapping(
            method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            path = "{studentId}"
    )
    public int updateStudentById(@PathVariable("studentId") UUID studentId, @RequestBody Student student){
        return studentService.updateStudentById(studentId, student);
    }

    @RequestMapping(
            method = RequestMethod.DELETE,
            path = "{studentId}"
    )
    public int deleteStudentById(@PathVariable("studentId") UUID studentId){
        return studentService.deleteStudentById(studentId);
    }
}
