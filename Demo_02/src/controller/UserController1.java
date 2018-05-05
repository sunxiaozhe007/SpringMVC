package controller;

import domain.User;
import domain.UserCustom;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("hello")
    public String MyHello(){
        return "hello";
    }
//接受int类型参数
    @RequestMapping("recieveInt")
    public String recieveInt(Integer id){
        System.out.println(id);

        return "success";
    }

    //跳转方法
    @RequestMapping("toAdd")
    public String toAdd(){
        return "add";
    }

    //接受String类型参数
    @RequestMapping("recieveStr")
    public String recieveStr(String username){
        System.out.println(username);

        return "success";
    }

    //接收javaBean对象
    @RequestMapping("recieveUser")
    public String recieveUser(User user){
        System.out.println(user);
        return "success";
    }


    //接收javaBean对象
    @RequestMapping("recieveUserCustom")
    public String recieveUserCustom(UserCustom user){
        System.out.println(user);
        return "success";
    }


    //接收数组
    @RequestMapping("recieveArray")
    public String recieveIds(Integer[] ids){
        System.out.println(ids);
        return "success";
    }


    //接受List集合类型参数
    @RequestMapping("recieveUserCustomList")
    public String recieveUserCustomList(UserCustom user){
        System.out.println(user);
        return "success";
    }

    //接受map类型参数
    @RequestMapping("recieveUserCustomMaps")
    public String recieveUserCustomMaps(UserCustom user){
        System.out.println(user);
        return "success";
    }

    //页面回显

    @RequestMapping("list")
    public String list(Model model){

        List<User> list = new ArrayList<User>();

        User user1 = new User();
        user1.setAddress("暴击");
        user1.setAge("22");
        user1.setBirthday(new Date());
        user1.setUsername("孙");
        user1.setId(1);

        User user2 = new User();
        user2.setAddress("山西");
        user2.setAge("21");
        user2.setBirthday(new Date());
        user2.setUsername("晓");
        user2.setId(2);

        User user3 = new User();
        user3.setAddress("暴击");
        user3.setAge("222");
        user3.setBirthday(new Date());
        user3.setUsername("哲");
        user3.setId(3);

        list.add(user1);
        list.add(user2);
        list.add(user3);

        model.addAttribute("userList",list);

        return "list";
    }


    @RequestMapping("update/{id}")
    public String update(@PathVariable Integer id){
        System.out.println(id);
        return"redirect:/user/list.do";
    }


}
