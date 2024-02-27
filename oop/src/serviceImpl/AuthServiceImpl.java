package serviceImpl;

import builder.UserBuilder;
import model.UserDto;
import service.AuthService;
import service.UtilService;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AuthServiceImpl implements AuthService {
    private static AuthService instance = new AuthServiceImpl();
    Map<String, UserDto> users;
    private AuthServiceImpl(){//디폴트 생성자를 막음
        this.users = new HashMap<>();
    }
    public static AuthService getInstance() {
        return instance;
    }

    @Override
    public String logIn(Scanner sc) {
        return null;
    }

    @Override
    public String join() {
        Scanner sc = new Scanner(System.in);
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
        System.out.println(user.toString());
        return "dsf";
    }

    @Override
    public String addUsers() {
        Map<String, UserDto> map=new HashMap<>();
        UtilService ut= UtilServiceImpl.getInstance();
        for(int i=0;i<5;i++) {
            String username=UtilServiceImpl.getInstance().createRandomUsername();
            map.put(username, new UserBuilder()
                    .username(username)
                    .name(ut.createRandomUsername())
                    .passWorld("1")
                    .passWorldCheck("1")
                    .build());
        }
        users= map;
        return "";
    }

    @Override
    public UserDto findUser(String username) {
        UserDto user=new UserBuilder()
                .build();
        return user;
    }

    @Override
    public Map<String, UserDto> getUserMap() {
        return users;
    }
    public String count(){
        return users.size()+"";

}

    @Override
    public String memberList() {
        for (int i = 0; i <1; i++) {
            System.out.println(users);
        }
        return String.valueOf(users);
    }
}
