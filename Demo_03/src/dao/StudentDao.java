package dao;

import domain.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentDao {
    List<Student> studentList() throws SQLException;

    void studentAdd(Student student) throws SQLException;

    void studentDelete(String num) throws SQLException;

    Student studentFind(String num) throws SQLException;

    Student studentFindId(String id) throws SQLException;

    void studentUpdate(Student student) throws SQLException;
}
