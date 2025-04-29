package com.danieln.mslogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.danieln.mslogin.domain.User;

public interface UserRepository extends JpaRepository<User, String> {

    UserDetails findByLogin(String login);
}
