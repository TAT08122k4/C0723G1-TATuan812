package com.example.hien_thi_danh_sach;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "customerServlet",value = "/customer")
public class CustomerServlet extends HttpServlet{
    private static List<Customer> customerList = new ArrayList<>();
    static {
        customerList.add(new Customer("Tuấn","08-12-2004","Lạng Sơn","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR4ANFCN_hE9VXyiYpuAFXmBWDZbPiQjNKcO0qmU_FgveTRily2IrzM2RvjKaXu_rGwyU8&usqp=CAU"));
        customerList.add(new Customer("Minh Tuấn","11-12-2005","Đà Nẵng","https://suckhoedoisong.qltns.mediacdn.vn/324455921873985536/2021/12/6/beo-phi-1-1638773505754126996379.jpg"));
        customerList.add(new Customer("Giàu","1-1-2001","Hà Tĩnh","https://nld.mediacdn.vn/zoom/700_438/2015/levanluyen-1429411483258.jpg"));
        customerList.add(new Customer("Hiếu Lợn","2-2-2001","Huế","https://baovephapluat.vn/data/images/0/2020/06/03/dungtv/gietnguoi.jpg?dpi=150&quality=100&w=830"));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("customerList",customerList);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("list.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
