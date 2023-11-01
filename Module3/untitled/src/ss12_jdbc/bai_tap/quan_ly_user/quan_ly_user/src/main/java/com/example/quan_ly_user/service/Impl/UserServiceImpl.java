package com.example.quan_ly_user.service.Impl;

import com.example.quan_ly_user.model.User;
import com.example.quan_ly_user.repository.IUserRepo;
import com.example.quan_ly_user.repository.impl.UserRepoImpl;
import com.example.quan_ly_user.service.IUserService;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements IUserService {
    private final IUserRepo userRepo = new UserRepoImpl();
    @Override
    public void insertUser(User user) throws SQLException {
     userRepo.insertUser(user);
    }

    @Override
    public User selectUser(int id) {
        return userRepo.selectUser(id);
    }

    @Override
    public List<User> selectAllUsers() {
        return userRepo.selectAllUsers();
    }

    @Override
    public boolean deleteUser(int id) throws SQLException {
        return userRepo.deleteUser(id);
    }

    @Override
    public boolean updateUser(User user) throws SQLException {
        return userRepo.updateUser(user);
    }

    @Override
    public List<User> searchByCountry(String country) {
        return userRepo.searchByCountry(country);
    }

    @Override
    public List<User> sortByName() {
        return userRepo.sortByName();
    }
}
