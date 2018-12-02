package com.rahadyan.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahadyan.model.Role;
import com.rahadyan.model.RoleName;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(RoleName roleName);
}
