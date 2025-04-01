package com.side.rest.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;

@AllArgsConstructor
@Builder
public class CommentResponseDto {

    private String contents;

    private int likes;

    private int dislikes;
}