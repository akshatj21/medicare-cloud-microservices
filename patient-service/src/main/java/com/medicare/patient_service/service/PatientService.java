package com.medicare.patient_service.service;

import com.medicare.patient_service.dto.PatientResponseDTO;
import com.medicare.patient_service.mapper.PatientMapper;
import com.medicare.patient_service.model.Patient;
import com.medicare.patient_service.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PatientService {

    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<PatientResponseDTO> getPatientDetails(){
        List<Patient> patients = patientRepository.findAll();
        return patients.stream()
                .map(PatientMapper::toDTO)
                .toList();
    }

}
