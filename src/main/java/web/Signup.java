package web;

import pojo.Appli;
import service.AppliService;
import service.impl.AppliServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Signup extends HttpServlet {

    private AppliService appliService = new AppliServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");

        resp.setContentType("text/html; charset=UTF-8");

        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String sex = req.getParameter("sex");
        String phone = req.getParameter("phone");
        String dept = req.getParameter("dept");
        String desc = req.getParameter("introduce");

        if (appliService.existId(id)) {
            appliService.resignup(new Appli(id, name, sex, phone, dept, desc));
        } else {
            appliService.signup(new Appli(id, name, sex, phone, dept, desc));
        }

        req.getRequestDispatcher("pages/报名成功.html").forward(req, resp);
    }
}

