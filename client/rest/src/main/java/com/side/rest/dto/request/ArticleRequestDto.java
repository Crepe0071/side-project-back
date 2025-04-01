package com.side.rest.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ArticleRequestDto {

    private String title;

    private String contents;

    private int likes;

    private int dislikes;
}