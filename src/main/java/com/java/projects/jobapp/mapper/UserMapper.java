package com.java.projects.jobapp.mapper;

import com.java.projects.jobapp.dto.auth.AuthResponse;
import com.java.projects.jobapp.dto.auth.RegisterRequest;
import com.java.projects.jobapp.dto.user.UserResponse;
import com.java.projects.jobapp.entity.User;
import com.java.projects.jobapp.enums.Role;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User toEntity(RegisterRequest request) {

        User user = new User();

        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());  // will be encode in service
        user.setRole(Role.APPLICANT);

        return user;
    }

    public UserResponse toUserResponse(User user) {

        return UserResponse.builder()
                .id(user.getId())
                .name(user.getName())
                .email(user.getEmail())
                .role(user.getRole())
                .createdAt(user.getCreatedAt())
                .updatedAt(user.getUpdatedAt())
                .build();
    }

    public AuthResponse toAuthResponse(User user, String token) {

        return AuthResponse.builder()
                .id(user.getId())
                .name(user.getName())
                .email(user.getEmail())
                .role(user.getRole())
                .token(token)
                .createdAt(user.getCreatedAt())
                .updatedAt(user.getUpdatedAt())
                .build();
    }
}
