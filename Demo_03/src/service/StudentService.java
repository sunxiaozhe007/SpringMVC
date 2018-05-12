package service;

import domain.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentService {
    //显示所有人信息
    List<Student> studentList() throws SQLException;

    //添加信息
    void studentAdd(Student student) throws SQLException;

    //删除信息
    void studentDelete(String num) throws SQLException;

    //查询
    Student studentFind(String num) throws SQLException;

    Student studentFindId(String id) throws SQLException;

    void studentUpdate(Student student) throws SQLException;
}
