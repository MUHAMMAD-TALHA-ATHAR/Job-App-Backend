package com.java.projects.jobapp.dto.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class RegisterRequest {

    @NotBlank(message = "Username is required")
    @Size(min = 3, max = 40, message = "Username must be between {min} and {max} characters")
    private String name;

    @NotBlank(message = "Email is required")
    @Size(max = 70, message = "Email cannot exceed {max} characters")
    @Email(message = "Email should be valid")
    private String email;

    @NotBlank(message = "Password is required")
    @Size(min = 6, message = "Password must be at least {min} characters long")
    private String password;

}