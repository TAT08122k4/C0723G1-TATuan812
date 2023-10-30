package com.example.ung_dung_calculator;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "calculator_app" ,value = "/calculate")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("------------Do get run -----------");
        float first_operator = Float.parseFloat(req.getParameter("first_operator"));
        String operator = req.getParameter("operator");
        float second_operator = Float.parseFloat(req.getParameter("second_operator"));

        float result = (float) calculate(first_operator,second_operator,operator);
        req.setAttribute("first_operator" , first_operator);
        req.setAttribute("second_operator" , second_operator);
        req.setAttribute("operator" , operator);
        req.setAttribute("result",result);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/result.jsp");
        requestDispatcher.forward(req,resp);
    }
     protected static double calculate(float num1 , float num2 , String operator){
        float sum = 0;
        switch (operator){
            case "Addition":
                return  num1 + num2;
            case "Subtraction":return num1 - num2;
            case "Division" : return num1 * num2;
            case "Multiplication" : if (num2 == 0 || num1 == 0) {
                return 0;
            }
                return num1 / num2;
        }
        return 0;
     }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("------------Do get run -----------");
        float first_operator = Float.parseFloat(req.getParameter("first_operator"));
        String operator = req.getParameter("operator");
        float second_operator = Float.parseFloat(req.getParameter("second_operator"));

        req.setAttribute("first_operator" , first_operator);
        req.setAttribute("second_operator" , second_operator);
        req.setAttribute("operator" , operator);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/result.jsp");
        requestDispatcher.forward(req,resp);
    }
}
