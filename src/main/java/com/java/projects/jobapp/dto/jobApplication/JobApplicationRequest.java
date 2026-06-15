package com.java.projects.jobapp.dto.jobApplication;


import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class JobApplicationRequest {

    @NotNull(message = "JobPostId is required")
    private Long jobPostId;
}
