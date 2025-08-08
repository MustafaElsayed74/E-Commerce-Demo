package com.shopping.userManagement.controller;

import com.shopping.userManagement.dto.AppUserDto;
import com.shopping.userManagement.entity.AppUser;
import com.shopping.userManagement.mapper.AppUserMapper;
import com.shopping.userManagement.service.AppUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AppUserService userService;
    private final AppUserMapper mapper;



    @GetMapping
    public ResponseEntity<List<AppUserDto>> getAll(){
        List<AppUser> users = userService.findAll();
        return ResponseEntity.ok(mapper.toDto(users));
    }


    @PostMapping
    public ResponseEntity<AppUser> create(@RequestBody AppUserDto dto){

        AppUser createdUser = userService.insert(mapper.fromDto(dto));

        return ResponseEntity.ok(createdUser);
    }
}
