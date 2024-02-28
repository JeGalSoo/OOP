package service;

import builder.UserBuilder;
import controller.UserController;
import model.UserDto;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public interface UserService {

    String addUsers();
    String join(UserDto join);
    UserDto login(Scanner sc);
    String findUserById(Scanner sc);
    void updatePassword(Scanner sc);
    void deleteUser(Scanner sc);
    void getUserList();
    List<UserDto> findUsersByName(String name);
    List<UserDto> findUsersByJob();
    int countUsers();

}
