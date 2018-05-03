package controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        //接受请求，接受参数，验证参数，处理请求
        //封装参数，调用业务方法，返回处理结果数据
        ModelAndView mv = new ModelAndView();
        //给ModelAndView设置数据，可以在页面回显
        mv.addObject("hello","孙晓哲");
        //设置物理视图
        mv.setViewName("/WEB-INF/jsps/index.jsp");
        return mv;
    }
}
