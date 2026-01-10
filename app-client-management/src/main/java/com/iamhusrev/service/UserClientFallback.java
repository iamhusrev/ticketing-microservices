package com.iamhusrev.service;

import com.iamhusrev.dto.UserDTO;
import com.iamhusrev.entity.ResponseWrapper;
import com.iamhusrev.service.UserClientService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class UserClientFallback implements UserClientService {

    @Override
    public ResponseWrapper getUsers() {
        return new ResponseWrapper("User service is currently unavailable", null, HttpStatus.SERVICE_UNAVAILABLE);
    }

    @Override
    public ResponseWrapper getUserByUserName(String userName) {
        return new ResponseWrapper("User service unavailable, cannot fetch user: " + userName, null, HttpStatus.SERVICE_UNAVAILABLE);
    }

    @Override
    public ResponseWrapper createUser(UserDTO user) {
        return new ResponseWrapper("Cannot create user right now, service down", null, HttpStatus.SERVICE_UNAVAILABLE);
    }

    @Override
    public ResponseWrapper updateUser(UserDTO user) {
        return new ResponseWrapper("Cannot update user right now", null, HttpStatus.SERVICE_UNAVAILABLE);
    }

    @Override
    public ResponseWrapper deleteUser(String userName) {
        return new ResponseWrapper("Cannot delete user right now", null, HttpStatus.SERVICE_UNAVAILABLE);
    }
}