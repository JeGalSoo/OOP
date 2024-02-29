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
    UserDto login(UserDto login);
    String findUserById(UserDto findUserById);
    String updatePassword(UserDto updatePassword);
    String deleteUser(UserDto deleteUser);
    String getUserList();
    List<UserDto> findUsersByName(UserDto findUsersByName);
    List<UserDto> findUsersByJob(UserDto findUsersByJob);
    String countUsers();

}
