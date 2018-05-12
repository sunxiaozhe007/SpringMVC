package dao;

import domain.Student;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.stereotype.Repository;
import util.C3P0Util;

import java.sql.SQLException;
import java.util.List;
@Repository("StudentDao")
public class StudentDaoImpl implements StudentDao {

    /**
     * 显示所有信息
     */
    @Override
    public List<Student> studentList() throws SQLException {
        QueryRunner queryRunner = new QueryRunner(C3P0Util.getDataSource());
        return queryRunner.query("select * from student",new BeanListHandler<Student>(Student.class));
    }

    /**
     * 添加信息
     */
    @Override
    public void studentAdd(Student student) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(C3P0Util.getDataSource());
        queryRunner.update("insert into student values(?,?,?,?)",student.getId(),student.getNum(),student.getName(),student.getSchool());
    }

    @Override
    public void studentDelete(String num) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(C3P0Util.getDataSource());
        queryRunner.update("delete from student where num=?",num);
    }

    @Override
    public Student studentFind(String num) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(C3P0Util.getDataSource());
        return queryRunner.query("select * from student where num=?",new BeanHandler<Student>(Student.class),num);
    }
    @Override
    public Student studentFindId(String id) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(C3P0Util.getDataSource());
        return queryRunner.query("select * from student where id=?",new BeanHandler<Student>(Student.class),id);
    }

    @Override
    public void studentUpdate(Student student) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(C3P0Util.getDataSource());
        queryRunner.update("update student set num=?,name=?,school=? where id=?",student.getNum(),student.getName(),student.getSchool(),student.getId());
    }
}
