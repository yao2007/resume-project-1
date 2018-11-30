package com.yao.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yao.flightreservation.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
