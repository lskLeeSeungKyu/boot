package com.boot.boot.service;

import com.boot.boot.dao.UserDAO;
import com.boot.boot.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserDAO userDAO;

    @Transactional
    public Map<String, String> userRegister(UserDTO userDTO) {
        Map<String, String> map = new HashMap<>();

        userDAO.userRegister(userDTO);
        map.put("result", "success");

        return map;
    }
}
