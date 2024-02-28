package controller;

import builder.UserBuilder;
import model.UserDto;
import service.UserService;
import serviceImpl.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserController {

    UserService us = UserServiceImpl.getInstance();


    public UserDto logIn(Scanner sc) {   //AuthServiceImpl의 것을 가져와야 됨

        return us.login(sc);
    }
    public String addUsers(){
//        System.out.println(us.addUsers());
        return us.addUsers();
    }

    public String join(Scanner sc) {
        System.out.println("이름, 아이디,비번,비번확인,주번," +
                "폰번,주소,직업,키,몸무게를 입력해주세요");
        UserDto join=new UserBuilder()
                .name(sc.next())
                .username(sc.next())
                .passWorld(sc.next())
                .passWorldCheck(sc.next())
                .sso(sc.nextInt())
                .phoneNumber(sc.nextInt())
                .address(sc.next())
                .job(sc.next())
                .height(sc.nextDouble())
                .weight(sc.nextInt())
                .build();
        return us.join(join);
    }

    public UserDto login(Scanner sc) {
        return us.login(sc);
    }

    public String findUserById(Scanner sc) {
        return us.findUserById(sc);
    }

    public void updatePassword(Scanner sc) {
        us.updatePassword(sc);

    }

    public void deleteUser(Scanner sc) {
        us.deleteUser(sc);
    }

    public void getUserList() {
        us.getUserList();
    }

    public List<UserDto> findUsersByName(Scanner sc) {
        String name = sc.next();
        return us.findUsersByName(name);
    }

    public List<UserDto> findUsersByJob() {
        return us.findUsersByJob();
    }

    public void countUsers() {
        us.countUsers();
    }
}