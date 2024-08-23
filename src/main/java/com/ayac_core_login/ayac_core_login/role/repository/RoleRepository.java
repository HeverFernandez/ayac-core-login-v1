package com.ayac_core_login.ayac_core_login.role.repository;

import com.ayac_core_login.ayac_core_login.role.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Integer> {

}
