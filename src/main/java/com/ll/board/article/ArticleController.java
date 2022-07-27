package com.ll.board.article;

import com.ll.board.Rq;
import com.ll.board.article.dto.ArticleDto;

import java.util.ArrayList;
import java.util.List;

public class ArticleController {
    ArticleService articleService;
    public ArticleController(){
        articleService = new ArticleService();
    }


    //왜 ShowList 가 rq 를 받아가지?
    //간단히 쓴다는 이유 하나?
    public void showList(Rq rq){
        rq.appendBody("게시물 리스트");
        List<ArticleDto> articleDtos = new ArrayList<ArticleDto>();

        rq.setAttr("articleDtos",articleDtos);
        rq.view("usr/article/list");

    }

    //추상화
    public void create(){}
    public void read(){}
    public void update(){}
    public void delete(){}
}
