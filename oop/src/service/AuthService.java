package service;

import model.UserDto;

import java.util.Map;
import java.util.Scanner;

public interface AuthService {
    String logIn(Scanner sc);
    String join();
    String addUsers();
    UserDto findUser(String username);
    Map<String, UserDto> getUserMap();
    String count();
    String memberList();
}
