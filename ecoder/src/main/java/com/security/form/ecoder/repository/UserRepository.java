package com.security.form.ecoder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.security.form.ecoder.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
 User findByEmail(String email);
}