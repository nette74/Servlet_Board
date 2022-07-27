package com.ll.board.member;

import com.ll.board.Rq;

public class MemberController {

    public void showLogin(Rq rq){
        rq.appendBody("로그인");
    }
}
