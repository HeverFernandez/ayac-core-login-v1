package com.ayac_core_login.ayac_core_login.role.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

@Data
public class RoleDTO {
    private Integer id;
    private String role_name;
    private String initials;
    private String description;
    private Integer state;
}
