package com.eventiniser.service;

import com.eventiniser.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findById(Long id);

    User findByEmail(String email);

    User save(User user);

    User update(User user);

    void deleteById(Long id);
}
