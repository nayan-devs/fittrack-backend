package com.project.fitness.controller;


import com.project.fitness.dto.ActivityRequest;
import com.project.fitness.dto.ActivityResponse;

import com.project.fitness.service.ActivityService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/activities")
@RequiredArgsConstructor
@Tag(name = "Activities", description = "Fitness activity management APIs")
public class ActivityController {

    private final ActivityService activityService;

    @PostMapping
    @Operation(summary = "Track a new fitness activity")
    public ResponseEntity<ActivityResponse> trackActivity(@Valid @RequestBody ActivityRequest request){
        return ResponseEntity.ok(activityService.trackActivity(request));
    }

    @GetMapping
    @Operation(summary = "get all activities for user")
    public ResponseEntity<List<ActivityResponse>> getUserActivities(
            @RequestHeader(value = "X-User-ID") String userId
    ){
        return ResponseEntity.ok(activityService.getUserActivities(userId));
    }
}
