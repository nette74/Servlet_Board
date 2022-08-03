package com.ll.board;

import com.ll.board.article.ArticleController;
import com.ll.board.member.MemberController;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


@WebServlet("/usr/*")
public class DispatchServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //한글 안 깨지게 하는 코드 어디있지? -> JSP 안에 있음.
        Rq rq = new Rq(req, resp);
        MemberController memberController = new MemberController();
        ArticleController articleController = new ArticleController();


        //req.getRequestURL();
        switch (rq.getMethod()){
            case "GET":
                switch (rq.getPath()) {


                    case "/usr/article":
                        articleController.showList(rq);
                        break;

                    case "/usr/article/write/free":
                        articleController.showWrite(rq);

                        break;

                    case "/usr/member":
                        memberController.showLogin(rq);
                        break;


                }
                break;
            case "POST":
                switch (rq.getPath()) {
                    case "/usr/article/write/free":
                        articleController.doWrite(rq);
                        break;

                    case "/usr/member":
                        memberController.doLogin(rq);
                        break;
                }
                break;
        }


    }
}
