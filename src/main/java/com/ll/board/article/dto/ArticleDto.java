package com.ll.board.article.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ArticleDto {
    long id;
    String title;
    String body;
}
