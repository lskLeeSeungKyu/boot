package com.boot.boot.dao;

import com.boot.boot.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDAO {
    void userRegister(UserDTO userDTO);
}

