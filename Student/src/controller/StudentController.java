package controller;

import domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.StudentService;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.List;

@Controller
public class StudentController {
     StudentService service = new StudentService();

    @RequestMapping("/list")
    public String list(HttpServletRequest request) throws SQLException {
        List<Student> list = service.studentList();
        request.setAttribute("list",list);

        return "list";
    }
    @RequestMapping("/add")
    public String add(HttpServletRequest request,Student student) throws SQLException {
        service.studentAdd(student);
        return list(request);
    }
    @RequestMapping("toAdd")
    public String toAdd(){
        return "add";
    }

    @RequestMapping("delete")
    public String delete(HttpServletRequest request, String num) throws SQLException {
        service.studentDelete(num);
        return list(request);
    }


    @RequestMapping("find")
    public String find(HttpServletRequest request,String num) throws SQLException {
        Student student = service.studentFind(num);
        request.setAttribute("student",student);
        return "find";
    }
    @RequestMapping("toFind")
    public String toFind(){
        return "find";
    }

    @RequestMapping("update")
    public String update(HttpServletRequest request,String id) throws SQLException {
        Student student = service.findID(id);
        request.setAttribute("student",student);
        return "update";
    }

    @RequestMapping("update1")
    public String update1(HttpServletRequest request,Student student) throws SQLException {
        service.update(student);
        return list(request);

    }
}
