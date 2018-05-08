package service;

import Dao.StudentDao;
import domain.Student;

import java.sql.SQLException;
import java.util.List;

public class StudentService {
    StudentDao studentDao = new StudentDao();

    //显示所有信息
    public List<Student> studentList() throws SQLException {

        return studentDao.listStudent();
    }
    //添加信息
    public void studentAdd(Student student) throws SQLException {
        studentDao.addStudent(student);
    }

    public void studentDelete(String num) throws SQLException {
        studentDao.delete(num);
    }

    public Student studentFind(String num) throws SQLException {
        return studentDao.findStudent(num);
    }

    public Student findID(String id) throws SQLException {
        return studentDao.findId(id);
    }

    public void update(Student student) throws SQLException {
        studentDao.updateStudent(student);
    }
}
