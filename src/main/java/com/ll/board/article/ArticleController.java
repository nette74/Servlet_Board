package com.ll.board.article;

import com.ll.board.Rq;
import com.ll.board.article.dto.ArticleDto;

import java.util.ArrayList;
import java.util.List;

public class ArticleController {
    //선언부
    ArticleService articleService;
    public List<ArticleDto> articleDtos;
    public ArticleController(){
        articleService = new ArticleService();

        //임시 레포 테스트용
        //레포 쓰기 전이니까 여기 선언
        articleDtos = new ArrayList<>();
        for(int i =1; i<=5; i++)
            articleDtos.add(new ArticleDto(i,"글 제목" + i,"내용번호" + i));
    }


    //왜 ShowList 가 rq 를 받아가지?
    public void showList(Rq rq){


            rq.appendBody("<div>게시물 리스트<div><br/>");




        try {
            //setAttr 의미는 알겠는데 사용법을 모르겠다. JSP 내부에서 어떻게 받는지도 자세히 봐야 할 듯.
            rq.setAttr("articleDtos", articleDtos);


        }
        catch (Exception e){
            rq.appendBody("<div>에러 발생 : "+ e +"<div><br/>");
        }
        //이제 list.jsp 를 실행할게.
        //왜 함수 이름은 view 인가?
        rq.view("usr/article/list");
    }

    //추상화
    //나중에 이름 고쳐서 구현하고 지울 것들
    public void create(){}
    public void read(){}
    public void update(){}
    public void delete(){}
}
