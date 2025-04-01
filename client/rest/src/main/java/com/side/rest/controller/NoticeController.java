package com.side.rest.controller;

import com.side.rest.dto.ApiResponse;
import com.side.rest.dto.request.NoticeRequestDto;
import com.side.rest.dto.response.NoticeResponseDto;
import com.side.rest.usecase.NoticeUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
public class NoticeController {

    private final NoticeUseCase noticeUseCase;

    @PostMapping
    public ResponseEntity<Void> create(
            @RequestBody NoticeRequestDto sideRequestDto
    ) {

        noticeUseCase.create(sideRequestDto);

        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ApiResponse<NoticeResponseDto> get(
            NoticeRequestDto noticeRequestDto
    ) {

        return ApiResponse.of(NoticeResponseDto.builder()
                                               .id(2L)
                                               .build());
    }
}
