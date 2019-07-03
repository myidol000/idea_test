package com.wxtj.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther:http://www.wxtjy.com
 * @Date:2019/7/2
 * @Description：${PACKAGE_NAME}
 * @Version: 1.0
 */
@WebServlet(name = "AddUser",urlPatterns = {"/addUser"})
public class AddUser extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            request.setCharacterEncoding("utf-8");
            String username = request.getParameter("username");
            String userage = request.getParameter("userage");
            System.out.println(username+"123"+userage);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            this.doPost(request,response);
    }
}
