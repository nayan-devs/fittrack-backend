package com.project.fitness.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RecommendationRequest {

    @NotBlank
    private String userId;

    @NotBlank
    private String activityId;

    @NotBlank
    private String type;

    @NotBlank
    private String recommendation;

    @NotEmpty
    private List<String> improvements;

    @NotEmpty
    private List<String> suggestions;

    @NotEmpty
    private List<String> safety;

}