package controller;

import domain.User;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.validation.BindException;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;

//从页面接受参数，封装到javaBean对象中
public class CommandController extends AbstractCommandController {
    //指定把参数封装到那个对象
    public CommandController(){
        this.setCommandClass(User.class);
    }
    @Override
    protected ModelAndView handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object command, BindException e) throws Exception {

        //值被封装命令对象

        User user = (User) command;
        ModelAndView mv = new ModelAndView();
        //设置数据
        mv.addObject("user",user);
        //制定返回视图页面
        mv.setViewName("/WEB-INF/jsps/index.jsp");
        return mv;
    }
//时间类型转换
    @Override
    protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {

        String str = request.getParameter("birthday");
        if (str.contains("/")){
            binder.registerCustomEditor(Date.class,
                    new CustomDateEditor(new SimpleDateFormat("yyyy/MM/dd"),true));

        }else {
            binder.registerCustomEditor(Date.class,
                    new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),true));
        }
        }



}
