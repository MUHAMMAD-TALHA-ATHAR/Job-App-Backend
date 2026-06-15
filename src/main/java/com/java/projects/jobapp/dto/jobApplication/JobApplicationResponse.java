package com.java.projects.jobapp.dto.jobApplication;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.java.projects.jobapp.enums.ApplicationStatus;

import java.time.LocalDateTime;

public record JobApplicationResponse(

        Long id,
        Long jobPostId,
        String jobTitle,
        Long applicantId,
        String applicantName,
        ApplicationStatus status,

        @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
        LocalDateTime createdAt,

        @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
        LocalDateTime updatedAt
) {
}
