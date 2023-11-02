package com.example.ung_dung_quan_ly_san_pham.controller;

import com.example.ung_dung_quan_ly_san_pham.model.Products;
import com.example.ung_dung_quan_ly_san_pham.service.IProductsService;
import com.example.ung_dung_quan_ly_san_pham.service.impl.ProductService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "productsServlet", value = "/products")
public class ProductsController extends HttpServlet {
    private IProductsService productsService = new ProductService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
           action = "";
        }
        switch (action){
            case "add":
               showAddForm(request,response);
                break;
            case "remove":
                showRemoveForm(request,response);
                break;
            case "edit":
                showEditForm(request,response);
                break;
            case "getDetail":
                showDetail(request,response);
                break;
            case "findByName":
                break;
            default:
              showAll(request,response);
        }
    }
    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("edit form");
        int id = Integer.parseInt(request.getParameter("idEdit"));
        Products editProduct = findById(id);
        request.setAttribute("id" , id);
        request.setAttribute("name" , editProduct.getName());
        request.setAttribute("price" , editProduct.getPrice());
        request.setAttribute("description " , editProduct.getDescription());
        request.setAttribute("manufacture" , editProduct.getManufacturer());
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/products/edit.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void showDetail(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/products/detail.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void showRemoveForm(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/products/remove.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void showAddForm(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/products/add.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void add(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        float price = Float.parseFloat(request.getParameter("price"));
        String description = request.getParameter("description");
        String manufacture = request.getParameter("manufacture");
        productsService.saveProducts(new Products(id,name,price,description,manufacture));
        try {
            response.sendRedirect("/products");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void showAll(HttpServletRequest request, HttpServletResponse response) {
        List<Products> productsList = productsService.getAll();
        request.setAttribute("productList",productsList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/list.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "add":
                add(request,response);
                break;
            case "remove":
                remove(request,response);
                break;
            case "edit":
                edit(request,response);
                break;
            case "getDetail":
                getDetail(request,response);
                break;
            case "findByName":
                break;
            default:
                showAll(request,response);
        }
    }

    private void edit(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("edit");
    int id = Integer.parseInt(request.getParameter("idEdit"));
    String name = request.getParameter("nameEdit");
    Float price = Float.parseFloat(request.getParameter("priceEdit"));
    String description = request.getParameter("descriptionEdit");
    String manufacture = request.getParameter("manufactureEdit");
     Products products = findById(id);
     products.setName(name);
     products.setPrice(price);
     products.setDescription(description);
     products.setManufacturer(manufacture);
        try {
            response.sendRedirect("/products");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private Products findById(int id){
          List<Products> productsList =  productsService.getAll();
          for (Products products : productsList){
              if (products.getId() == id){
                  return products;
              }
          }
return null;
    }

    private void getDetail(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Products products = productsService.getDetail(id);
        request.setAttribute("product",products);
    }

    private void remove(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        productsService.remove(id);
        try {
            response.sendRedirect("/products");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
