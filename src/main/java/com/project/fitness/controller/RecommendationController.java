package com.project.fitness.controller;


import com.project.fitness.dto.RecommendationRequest;
import com.project.fitness.dto.RecommendationResponse;
import com.project.fitness.service.RecommendationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recommendation")
@RequiredArgsConstructor
@Tag(name = "Recommendations", description = "Fitness recommendation APIs")
public class RecommendationController {

    private final RecommendationService recommendationService;

    @PostMapping("/generate")
    @Operation(summary = "Generate recommendation for an activity")
    public ResponseEntity<RecommendationResponse> generateRecommendation(@Valid @RequestBody RecommendationRequest request){
        RecommendationResponse response = recommendationService.generateRecommendation(request);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/user/{userId}")
    @Operation(summary = "Get all recommendations for a user")
    public ResponseEntity<List<RecommendationResponse>> getUserRecommendation(@PathVariable String userId){
        List<RecommendationResponse> recommendationList = recommendationService.getUserRecommendation(userId);
        return ResponseEntity.ok(recommendationList);
    }

    @GetMapping("/activity/{activityId}")
    @Operation(summary = "Get recommendations by activity")
    public ResponseEntity<List<RecommendationResponse>> getActivityRecommendation(@PathVariable String activityId){
        List<RecommendationResponse> recommendationList = recommendationService.getActivityRecommendation(activityId);
        return ResponseEntity.ok(recommendationList);
    }

}