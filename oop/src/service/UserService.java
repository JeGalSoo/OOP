package service;

import model.UserDto;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public interface UserService {
    String join(Scanner sc);
    String login(Scanner sc);
    UserDto findUserById(String username);
    void updatePassword(UserDto user);
    String deleteUser(String username);
    Map<String, UserDto> getUserList();
    List<UserDto> findUsersByName(String name);
    List<UserDto> findUsersByJob(String job);
    int countUsers();

}
