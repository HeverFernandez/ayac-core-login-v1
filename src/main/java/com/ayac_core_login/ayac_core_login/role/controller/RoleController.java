package com.ayac_core_login.ayac_core_login.role.controller;

import com.ayac_core_login.ayac_core_login.role.model.Role;
import com.ayac_core_login.ayac_core_login.role.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoleController {

    @Autowired
    RoleService roleService;

    @PostMapping("/role")
    @ResponseBody
    public Role createRole(@RequestBody Role role){

        return  roleService.createRole(role);
    }
    @GetMapping("/role")
    @ResponseBody
    public List<Role> getAllRole(){
        return roleService.getAllRole();
    }
    @DeleteMapping("/role/{id}")
    public void deleteRole(@PathVariable Integer id){
        roleService.deleteRole(id);
    }
    @GetMapping("role/{id}")
    @ResponseBody
    public Role getRoleById(@PathVariable Integer id){
        return roleService.getRoleById(id);
    }
    @PutMapping("/role")

    public void updateRole(@RequestBody Role role){

        roleService.updateRole(role);

    }

  }
