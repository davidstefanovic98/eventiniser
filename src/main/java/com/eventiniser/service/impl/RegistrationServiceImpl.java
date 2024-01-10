package com.eventiniser.service.impl;

import com.eventiniser.entity.Registration;
import com.eventiniser.repository.RegistrationRepository;
import com.eventiniser.service.RegistrationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class RegistrationServiceImpl implements RegistrationService {

    private final RegistrationRepository registrationRepository;

    @Override
    public List<Registration> findAll() {
        return registrationRepository.findAll();
    }

    @Override
    public Registration findById(Long id) {
        return registrationRepository
                .findById(id)
                .orElseThrow(() -> new NoSuchElementException("Registration not found with id: " + id));
    }

    @Override
    public Registration save(Registration registration) {
        return registrationRepository.save(registration);
    }

    @Override
    public Registration update(Registration registration) {
        return registrationRepository.save(registration);
    }

    @Override
    public void deleteById(Long id) {
        registrationRepository.deleteById(id);
    }
}
