/*
package serviceImpl;
import builder.UserBuilder;
import jdk.jshell.execution.Util;
import model.UserDto;
import service.AuthService;
import service.UserService;
import service.UtilService;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuthServiceImpl implements AuthService {
    private static AuthService instance = new AuthServiceImpl();
    Map<String, UserDto> users;

    private AuthServiceImpl() {
        users = new HashMap<>();
    }

    public static AuthService getInstance() {
        return instance;
    } //디폴트 생성자를 막음

    @Override
    public String addUsers() {
        UtilService us = UtilServiceImpl.getInstance();
        for (int i = 0; i < 5; i++) {
            String username = UtilServiceImpl.getInstance().createRandomUsername();
            users.put(username, new UserBuilder()
                    .username(username)
                    .name(us.createRandomUsername())
                    .passWorld("1")
                    .passWorldCheck("1")
                    .build());
        }
        return users.size() + "";

    }

    @Override
    public String join(UserDto user) {
        return null;
    }

    @Override
    public String login(UserDto user) {
        return null;
    }

    @Override
    public UserDto findUserById(String username) {
        return null;
    }

    @Override
    public String updatePassword(UserDto user) {
        return null;
    }

    @Override
    public String deleteUser(String username) {
        return null;
    }

    @Override
    public Map<String, UserDto> getUserList() {
        return null;
    }

    @Override
    public List<UserDto> findUsersByName(String name) {
        return null;
    }

    @Override
    public List<UserDto> findUsersByJob(String job) {
        return null;
    }

    @Override
    public String countUsers() {
        return null;
    }
}
*/
