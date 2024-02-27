package controller;

import model.UserDto;
import service.UserService;
import serviceImpl.AuthServiceImpl;
import serviceImpl.UserServiceImpl;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UserController {

    UserService us = UserServiceImpl.getInstance();


    public String logIn(Scanner sc) {   //AuthServiceImpl의 것을 가져와야 됨

        return us.login(sc);
    }
    public String addUsers(){
        return null;
    }




    public String join(Scanner sc) {
        return us.join(sc);
    }

    public String login(UserDto user) {
        return null;
    }

    public UserDto findUserById(String username) {
        return null;
    }

    public void updatePassword(UserDto user) {

    }

    public String deleteUser(String username) {
        return null;
    }

    public Map<String,UserDto> getUserList() {
        return us.getUserList();
    }

    public List<UserDto> findUsersByName(String name) {
        return null;
    }

    public List<UserDto> findUsersByJob(String job) {
        return null;
    }

    public void countUsers() {
        System.out.println("회원수 : " + us.countUsers()+" 명");
        us.countUsers();
    }
}