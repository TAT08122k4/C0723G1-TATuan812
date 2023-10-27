package com.example.products_discount_calculator;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "productscalculator", value = "/products-calculator")
public class ProductsCalculator extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("------------Do get run--------------");
        String productDescription = request.getParameter("product_Description");
        float productPrice = Float.parseFloat(request.getParameter("product_Price"));
        float discountPercent = Float.parseFloat(request.getParameter("discount_Percent"));
        double disAmount = productPrice * discountPercent * 0.01;
        double disPrice = productPrice - disAmount;

        request.setAttribute("description" ,productDescription);
        request.setAttribute("price" ,productPrice);
        request.setAttribute("percent" ,discountPercent);
        request.setAttribute("disAmount" ,disAmount);
        request.setAttribute("disPrice",disPrice);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/result.jsp");
        requestDispatcher.forward(request,response);

    }

    public void destroy() {
    }
}