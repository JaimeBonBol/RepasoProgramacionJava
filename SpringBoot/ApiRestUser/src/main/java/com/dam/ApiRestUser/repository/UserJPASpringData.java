package com.dam.ApiRestUser.repository;

import com.dam.ApiRestUser.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJPASpringData extends JpaRepository<User, Integer> {
}
