package fun.navajo.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fun.navajo.demo.pojo.Student;
import fun.navajo.demo.service.StudentService;

/**
 * Student的url访问控制类
 * @author jcq
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    /**
     * 查询所有学生数据
     * @return 所有学生列表
     */
    @RequestMapping("/all")
    public List<Student> queryAllStudents () {
        return studentService.queryAllStudents();
    }
}