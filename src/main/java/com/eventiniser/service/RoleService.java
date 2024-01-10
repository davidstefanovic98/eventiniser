package com.eventiniser.service;

import com.eventiniser.entity.Role;

import java.util.List;

public interface RoleService {

    List<Role> findAll();

    Role findById(Long id);

    Role save(Role role);

    Role update(Role role);

    void deleteById(Long id);
}
