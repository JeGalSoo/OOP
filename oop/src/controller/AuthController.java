package controller;

import service.AuthService;
import serviceImpl.AuthServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AuthController {
    Scanner sc = new Scanner(System.in);

    AuthService auth;

    public AuthController() {
        this.auth = AuthServiceImpl.getInstance();
    }

    public String logIn() {   //AuthServiceImpl의 것을 가져와야 됨

        return auth.logIn(sc);
    }

    public String join() {  //AuthServiceImpl의 것을 가져와야 됨
        return auth.join();
    }

    public String addUsers() {
        return auth.addUsers();
    }

    public void findUser(String username) {
        auth.findUser(username);
    }
    public String count(){
        System.out.println("회원수 : " + auth.count()+" 명");
        return auth.count();
    }
    public String memberList(){
        return auth.memberList();
    }
}
