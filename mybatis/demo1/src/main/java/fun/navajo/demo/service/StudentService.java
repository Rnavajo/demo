package fun.navajo.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fun.navajo.demo.dao.StudentDao;
import fun.navajo.demo.pojo.Student;

/**
 * Student业务类
 * @author jcq
 */
@Service("studentService")
public class StudentService {
    @Autowired
    private StudentDao studentDao;

    /**
     * 查询所有学生数据
     * @return 所有学生列表
     */
    public List<Student> queryAllStudents () {
        return studentDao.queryAllStudents();
    }
}