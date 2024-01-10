package com.eventiniser.service;

import com.eventiniser.entity.Registration;

import java.util.List;

public interface RegistrationService {

    List<Registration> findAll();

    Registration findById(Long id);

    Registration save(Registration registration);

    Registration update(Registration registration);

    void deleteById(Long id);
}
