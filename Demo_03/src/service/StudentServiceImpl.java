package service;

import dao.StudentDao;
import domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    @Qualifier("StudentDao")
    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    //显示所有人信息
    @Override
    public List<Student> studentList() throws SQLException {
        return studentDao.studentList();
    }
    //添加信息
    @Override
    public void studentAdd(Student student) throws SQLException {
        studentDao.studentAdd(student);
    }
    //删除信息
    @Override
    public void studentDelete(String num) throws SQLException {
        studentDao.studentDelete(num);
    }
    //查询
    @Override
    public Student studentFind(String num) throws SQLException {
       return studentDao.studentFind(num);
    }

    @Override
    public Student studentFindId(String id) throws SQLException {
        return studentDao.studentFindId(id);
    }

    @Override
    public void studentUpdate(Student student) throws SQLException {
        studentDao.studentUpdate(student);
    }

}
