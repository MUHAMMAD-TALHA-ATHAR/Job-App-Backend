package com.java.projects.jobapp.dto.jobPost;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.java.projects.jobapp.enums.ExperienceLevel;
import com.java.projects.jobapp.enums.JobType;
import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Builder
@Jacksonized
public record JobPostResponse(

        Long id,
        String title,
        String description,
        String company,
        String location,
        JobType jobType,
        ExperienceLevel experienceLevel,
        BigDecimal salary,
        boolean active,

        @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
        LocalDateTime createdAt,

        @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
        LocalDateTime updatedAt
) {
}
