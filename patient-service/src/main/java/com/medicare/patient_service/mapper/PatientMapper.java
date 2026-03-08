package com.medicare.patient_service.mapper;

import com.medicare.patient_service.dto.PatientResponseDTO;
import com.medicare.patient_service.model.Patient;

public class PatientMapper {

    public static PatientResponseDTO toDTO(Patient p){
        PatientResponseDTO patientDTO = new PatientResponseDTO();
        patientDTO.setId(p.getId().toString());
        patientDTO.setName(p.getName());
        patientDTO.setAddress(p.getAddress());
        patientDTO.setEmail(p.getEmail());
        patientDTO.setDateOfBirth(p.getDateOfBirth().toString());
        return patientDTO;
    }
}
