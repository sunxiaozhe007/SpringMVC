package controller;

import domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.StudentService;
import java.sql.SQLException;
import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;


    //显示所有人信息
    @RequestMapping("list")
    public String list(Model model) throws SQLException {
        List<Student> list = studentService.studentList();
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping("add")
    public String add(Student student) throws SQLException {
        studentService.studentAdd(student);

        return "redirect:list";
    }
    @RequestMapping("toAdd")
    public String toAdd(){
        return "add";
    }

    @RequestMapping("delete")
    public String delete(String num) throws SQLException {
        studentService.studentDelete(num);
        return "redirect:list";
    }

    @RequestMapping("find")
    public String find(String num,Model model) throws SQLException {
        Student student = studentService.studentFind(num);
        model.addAttribute("student",student);
        return "find";
    }

    @RequestMapping("toFind")
    public String toFind(){
        return "find";
    }

    @RequestMapping("update")
    public String update(Model model,String id) throws SQLException {
        Student student = studentService.studentFindId(id);
        model.addAttribute("student",student);
        return "update";
    }

    @RequestMapping("update1")
    public String update1(Student student) throws SQLException {
        studentService.studentUpdate(student);
        return "redirect:list";
    }
}
