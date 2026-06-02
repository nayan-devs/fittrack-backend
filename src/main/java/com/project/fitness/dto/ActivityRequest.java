package com.project.fitness.dto;

import com.project.fitness.model.ActivityType;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActivityRequest {

    @NotBlank
    private String userId;

    @NotNull
    private ActivityType type;

    @NotEmpty
    private Map<String,Object> additionalMetrics;

    @NotNull
    @Min(1)
    private Integer duration;

    @NotNull
    @Min(0)
    private Integer caloriesBurned;

    @NotNull
    private LocalDateTime startTime;
}
