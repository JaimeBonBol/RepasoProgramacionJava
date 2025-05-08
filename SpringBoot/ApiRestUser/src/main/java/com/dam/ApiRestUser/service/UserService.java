package com.dam.ApiRestUser.service;

import com.dam.ApiRestUser.model.User;

import java.util.List;

public interface UserService {

    public User createUser(User user);

    public List<User> getAllUsers();

    public User getUserById(Integer id);

    public User updateUser(Integer id, User user);

    public void deleteUser(Integer id);

}
