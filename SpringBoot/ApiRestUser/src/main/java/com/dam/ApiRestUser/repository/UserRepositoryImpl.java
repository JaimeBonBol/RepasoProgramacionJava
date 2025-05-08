package com.dam.ApiRestUser.repository;

import com.dam.ApiRestUser.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository{

    @Autowired
    private UserJPASpringData userJPASpringData;


    @Override
    public User createUser(User user) {
        return userJPASpringData.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userJPASpringData.findAll();
    }

    @Override
    public User getUserById(Integer id) {
        return userJPASpringData.findById(id).orElse(null);
    }

    @Override
    public User updateUser(Integer id, User user) {
        user.setId(id);
        return userJPASpringData.save(user);
    }

    @Override
    public void deleteUser(Integer id) {
        userJPASpringData.deleteById(id);
    }
}
