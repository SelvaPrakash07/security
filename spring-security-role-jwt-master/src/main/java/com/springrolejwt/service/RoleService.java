package com.springrolejwt.service;

import com.springrolejwt.model.Role;

public interface RoleService {
    Role findByName(String name);
}
