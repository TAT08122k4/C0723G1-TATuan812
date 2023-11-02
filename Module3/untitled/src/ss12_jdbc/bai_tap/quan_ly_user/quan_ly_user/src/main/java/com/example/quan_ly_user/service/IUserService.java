package com.example.quan_ly_user.service;

import com.example.quan_ly_user.model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserService {
    public void insertUser(User user) throws SQLException;

    public User selectUser(int id);

    public List<User> selectAllUsers();

    public boolean deleteUser(int id) throws SQLException;

    public boolean updateUser(User user) throws SQLException;
    public List<User> searchByCountry(String country);
    public List<User> sortByName();
    public List<User> displayProcedure();
    public boolean updateUser_procedure(User user);
    public boolean deleteProcedure(int id);
}
