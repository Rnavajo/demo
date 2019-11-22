package fun.navajo.demo.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import fun.navajo.demo.pojo.Student;

/**
 * Student相关数据库操作类
 * @author jcq
 */
@Mapper
public interface StudentDao {
    /**
     * 查询所有学生数据
     * @return 所有学生列表
     */
    List<Student> queryAllStudents();
}