package controller;

import domain.User;
import domain.UserCustom;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
