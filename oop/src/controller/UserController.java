package controller;

import builder.UserBuilder;
import model.UserDto;
import service.UserService;
import serviceImpl.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserController {

    UserService us;


/*    public UserDto logIn(Scanner sc) {   //AuthServiceImpl의 것을 가져와야 됨

        return us.login(sc);
    }*/
    public UserController(){
        us = UserServiceImpl.getInstance();
    }
    public String addUsers(){
        return us.addUsers();
    }

    public String join(Scanner sc) {
        System.out.println("이름, 아이디,비번,비번확인,주번," +
                "폰번,주소,직업,키,몸무게를 입력해주세요");
            return us.join(new UserBuilder()
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
                .build());
    }

    public UserDto login(Scanner sc) {
        System.out.println("ID를 입력 하세요");
        return us.login(new UserBuilder()
                .username(sc.next())
                .passWorld(sc.next())
                .build());
    }


    public String findUserById(Scanner sc) {
        return us.findUserById(new UserBuilder()
                .username(sc.next())
                .build());
    }

    public String updatePassword(Scanner sc) {
        return us.updatePassword(new UserBuilder()
                        .username(sc.next())
                        .passWorld(sc.next())
                .build());

    }

    public String deleteUser(Scanner sc) {
        return us.deleteUser(new UserBuilder()
                        .username(sc.next())
                .build());
    }

    public String getUserList() {

        return us.getUserList();
    }

    public List<UserDto> findUsersByName(Scanner sc) {
        return us.findUsersByName(new UserBuilder()
                        .username(sc.next())
                .build());
    }

    public List<UserDto> findUsersByJob(Scanner sc) {
        return us.findUsersByJob(new UserBuilder()
                        .username(sc.next())
                .build());
    }

    public String countUsers() {
        return us.countUsers();
    }
}