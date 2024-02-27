package serviceImpl;

import builder.UserBuilder;
import controller.UserController;
import model.UserDto;
import service.AuthService;
import service.UserService;
import service.UtilService;

import java.util.*;

public class UserServiceImpl implements UserService {
    private static UserService instance = new UserServiceImpl();
    Map<String, UserDto> users;
    private UserServiceImpl(){//디폴트 생성자를 막음
        this.users = new HashMap<>();
    }
    public static UserService getInstance() {
        return instance;
    }

    @Override
    public String join(Scanner sc) {
        Map<String, UserDto>map=new HashMap<>();
        System.out.println("이름,아이디,비번,비번확인,주번," +
                "폰번,주소,직업,키,몸무게를 입력해주세요");
        UserDto user = new UserBuilder()
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
        System.out.println(user);
        users=map;
        return "완료!";
    }

    @Override
    public String login(Scanner sc) {
        return null;
    }

    @Override
    public UserDto findUserById(String username) {
        return null;
    }

    @Override
    public void updatePassword(UserDto user) {

    }

    @Override
    public String deleteUser(String username) {
        return null;
    }

    @Override
    public Map<String, UserDto> getUserList() {
        for (int i = 0; i <5; i++) {
            System.out.println(users);
        }
        return users;
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
    public int countUsers() {
        return users.size();
    }
}
