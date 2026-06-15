package com.java.projects.jobapp.mapper;

import com.java.projects.jobapp.dto.company.CompanyRequest;
import com.java.projects.jobapp.dto.company.CompanyResponse;
import com.java.projects.jobapp.entity.Company;
import org.springframework.stereotype.Component;

@Component
public class CompanyMapper {

    public Company toEntity(CompanyRequest request) {

        Company company = new Company();

        company.setName(request.getName());
        company.setOwnerEmail(request.getOwnerEmail());
        company.setDescription(request.getDescription());
        company.setLocation(request.getLocation());
        company.setActive(true);

        return company;
    }

    public CompanyResponse toResponse(Company company) {

        return CompanyResponse.builder()
                .id(company.getId())
                .name(company.getName())
                .email(company.getOwnerEmail())
                .description(company.getDescription())
                .location(company.getLocation())
                .active(company.isActive())
                .createdAt(company.getCreatedAt())
                .updatedAt(company.getUpdatedAt())
                .build();
    }

}
