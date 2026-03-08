package com.medicare.patient_service.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class PatientResponseDTO {
    private String id;

    @NotNull
    private String name;

    @NotNull
    @Email
    private String email;

    @NotNull
    private String address;

    @NotNull
    private String dateOfBirth;
}
