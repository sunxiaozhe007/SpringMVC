package controller;

import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HttpController implements HttpRequestHandler {
    @Override
    public void handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {


        //给页面返回一个值
        httpServletRequest.setAttribute("hello","sunxiaozhe");
        //设置跳转物理视图
        httpServletRequest.getRequestDispatcher("/WEB-INF/jsps/index.jsp").forward(httpServletRequest,httpServletResponse);
    }
}
