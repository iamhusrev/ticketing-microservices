package com.iamhusrev.service;

import com.iamhusrev.dto.UserDTO;
import com.iamhusrev.entity.User;
import com.iamhusrev.exception.UserServiceException;

import java.nio.file.AccessDeniedException;
import java.util.List;

public interface UserService {

    List<UserDTO> listAllUsers();
    UserDTO findByUserName(String username) throws AccessDeniedException;
    UserDTO save(UserDTO dto) throws UserServiceException;
    UserDTO update(UserDTO dto) throws UserServiceException, AccessDeniedException;
    void delete(String username) throws UserServiceException;

    void deleteByUserName(String username);

    List<UserDTO> listAllByRole(String role);

//    Boolean checkIfUserCanBeDeleted(User user);

    UserDTO confirm(User user);


}
