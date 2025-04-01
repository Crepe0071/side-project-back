package com.side.rest.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;

import java.time.Instant;

@AllArgsConstructor
@Builder
public class MetadataResponseDto {

    private String createdBy;

    private Instant createdAt;

    private String modifiedBy;

    private Instant modifiedAt;
}