package com.iamhusrev.service;

import com.iamhusrev.dto.RoleDTO;
import com.iamhusrev.exception.UserServiceException;

import java.util.List;

public interface RoleService {

    List<RoleDTO> listAllRoles();
    RoleDTO findById(Long id) throws UserServiceException;
}
