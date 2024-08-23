package com.ayac_core_login.ayac_core_login.role.service;

import com.ayac_core_login.ayac_core_login.role.model.Role;
import com.ayac_core_login.ayac_core_login.role.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    @Autowired
    RoleRepository roleRepository;

    public Role createRole(Role person){
        return roleRepository.save(person);

    }
    public void deleteRole(Integer id){
        roleRepository.deleteById(id);
    }
    public List<Role> getAllRole(){
        return roleRepository.findAll();
    }

    public Role getRoleById(Integer id){
        return roleRepository.findById(id).orElse(null);
    }

    public void updateRole(Role role){
        roleRepository.save(role);

    }




}
