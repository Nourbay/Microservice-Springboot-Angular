package com.example.userapi.dto;

import com.example.userapi.model.Job;
import com.example.userapi.model.Role;

public record UserResponseDTO(
        String id,
        String nomuser,
        String prenomuser,
        int ageuser,
        String phoneuser,
        String sexeuser,
        String addresseuser,
        String mailuser,
        Job job,
        Role role
) {}
