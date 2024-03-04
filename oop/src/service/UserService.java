package service;

import model.User;

import java.util.List;

public interface UserService {

    String addUsers();
    String join(User join);
    User login(User login);
    String findUserById(User findUserById);
    String updatePassword(User updatePassword);
    String deleteUser(User deleteUser);
    String getUserList();
    List<User> findUsersByName(User findUsersByName);
    List<User> findUsersByJob(User findUsersByJob);
    String countUsers();

}
