package com.spring.interview.api.h2.model.repository;

import com.spring.interview.api.h2.model.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
}

