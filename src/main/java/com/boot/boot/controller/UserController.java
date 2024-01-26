package com.boot.boot.controller;

import com.boot.boot.dto.UserDTO;
import com.boot.boot.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/userRegister")
    public Map<String, String> userRegister(UserDTO userDTO) {
        return userService.userRegister(userDTO);
    }
}
