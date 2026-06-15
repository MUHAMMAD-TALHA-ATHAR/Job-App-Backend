package com.java.projects.jobapp.mapper;

import com.java.projects.jobapp.dto.jobApplication.JobApplicationResponse;
import com.java.projects.jobapp.entity.JobApplication;
import com.java.projects.jobapp.entity.JobPost;
import com.java.projects.jobapp.entity.User;
import com.java.projects.jobapp.enums.ApplicationStatus;
import org.springframework.stereotype.Component;

@Component
public class JobApplicationMapper {

    public JobApplication toEntity(
            JobPost jobPost,
            User applicant) {

        JobApplication application = new JobApplication();

        application.setJobPost(jobPost);
        application.setApplicant(applicant);
        application.setStatus(ApplicationStatus.APPLIED);

        return application;
    }

    public JobApplicationResponse toResponse(
            JobApplication application) {

        return new JobApplicationResponse(
                application.getId(),

                application.getJobPost().getId(),
                application.getJobPost().getTitle(),

                application.getApplicant().getId(),
                application.getApplicant().getName(),

                application.getStatus(),

                application.getCreatedAt(),
                application.getUpdatedAt()
        );
    }
}
