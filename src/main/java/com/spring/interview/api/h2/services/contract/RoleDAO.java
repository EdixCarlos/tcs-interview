package com.spring.interview.api.h2.services.contract;

import com.spring.interview.api.h2.model.RoleModel;

import java.util.List;

public interface RoleDAO {

    public RoleModel createRole(RoleModel roleModel);
    public List<RoleModel> getAllRoles();
    public RoleModel getRoleById(Long roleId);
    public void deleteRoleById(Long roleId);
}
