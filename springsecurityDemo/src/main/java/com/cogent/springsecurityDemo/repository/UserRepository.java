package com.cogent.springsecurityDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.springsecurityDemo.dto.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
