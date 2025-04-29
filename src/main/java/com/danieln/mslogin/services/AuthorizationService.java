package com.danieln.mslogin.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.danieln.mslogin.repository.UserRepository;

@Service
public class AuthorizationService implements UserDetailsService {

    @Autowired
    UserRepository repository;
    @Autowired
    public AuthorizationService(UserRepository repository) {
        this.repository = repository;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return repository.findByLogin(username);
    }

}
