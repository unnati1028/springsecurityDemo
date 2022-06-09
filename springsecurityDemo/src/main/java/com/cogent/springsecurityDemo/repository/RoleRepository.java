package com.cogent.springsecurityDemo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cogent.springsecurityDemo.dto.Role;
import com.cogent.springsecurityDemo.enums.ERole;
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}
