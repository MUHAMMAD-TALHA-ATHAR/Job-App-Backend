package com.java.projects.jobapp.dto.company;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CompanyRequest {

    @NotBlank(message = "Company name is required")
    @Size(max = 150)
    private String name;

    @NotBlank(message = "Company email must be required")
    @Size(max = 70, message = "Email cannot exceed {max} characters")
    @Email(message = "Email should be valid")
    private String ownerEmail;

    @Size(max = 1000)
    private String description;

    @Size(max = 100)
    private String location;
}
