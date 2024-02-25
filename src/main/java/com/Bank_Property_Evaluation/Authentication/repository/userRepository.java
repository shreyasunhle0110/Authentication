package com.Bank_Property_Evaluation.Authentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Bank_Property_Evaluation.Authentication.entity.User;

public interface userRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
