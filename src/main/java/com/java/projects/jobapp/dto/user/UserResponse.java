package com.java.projects.jobapp.dto.user;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.java.projects.jobapp.enums.Role;
import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

import java.time.LocalDateTime;

@Builder
@Jacksonized
public record UserResponse(
        Long id,
        String name,
        String email,
        Role role,

        @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
        LocalDateTime createdAt,

        @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
        LocalDateTime updatedAt
) {
}
