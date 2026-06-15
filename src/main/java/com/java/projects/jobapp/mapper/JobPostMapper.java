package com.java.projects.jobapp.mapper;

import com.java.projects.jobapp.dto.jobPost.JobPostRequest;
import com.java.projects.jobapp.dto.jobPost.JobPostResponse;
import com.java.projects.jobapp.entity.Company;
import com.java.projects.jobapp.entity.JobPost;
import com.java.projects.jobapp.entity.User;
import org.springframework.stereotype.Component;

@Component
public class JobPostMapper {

    public JobPost toEntity(
            JobPostRequest request,
            Company company,
            User postedBy) {

        JobPost jobPost = new JobPost();

        jobPost.setTitle(request.getTitle());
        jobPost.setDescription(request.getDescription());
        jobPost.setCompany(company);
        jobPost.setLocation(request.getLocation());
        jobPost.setJobType(request.getJobType());
        jobPost.setExperienceLevel(request.getExperienceLevel());
        jobPost.setSalary(request.getSalary());
        jobPost.setPostedBy(postedBy);
        jobPost.setActive(true);

        return jobPost;
    }

    public JobPostResponse toResponse(JobPost jobPost) {

        return JobPostResponse.builder()
                .id(jobPost.getId())
                .title(jobPost.getTitle())
                .description(jobPost.getDescription())
                .company(jobPost.getCompany().getName())
                .location(jobPost.getLocation())
                .jobType(jobPost.getJobType())
                .experienceLevel(jobPost.getExperienceLevel())
                .salary(jobPost.getSalary())
                .active(jobPost.isActive())
                .createdAt(jobPost.getCreatedAt())
                .updatedAt(jobPost.getUpdatedAt())
                .build();
    }
}
