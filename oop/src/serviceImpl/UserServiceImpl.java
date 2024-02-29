package serviceImpl;
import builder.UserBuilder;
import com.sun.jdi.Value;
import lombok.Getter;
import model.UserDto;
import service.UserService;
import service.UtilService;

import java.security.Key;
import java.util.*;
//id pw pw 94 12 ad jo 123 321
public class UserServiceImpl implements UserService {
    @Getter
    private static UserService instance = new UserServiceImpl();
    Map<String, UserDto> users;
    boolean check=false;
    private UserServiceImpl(){//디폴트 생성자를 막음
        users = new HashMap<>();
    }

    @Override
    public String addUsers() {
        UtilService ut= UtilServiceImpl.getInstance();
        for(int i=0;i<5;i++) {
            String username=UtilServiceImpl.getInstance().createRandomUsername();
            users.put(username, new UserBuilder()
                    .username(username)
                    .name(ut.createRandomUsername())
                    .passWorld("1")
                    .passWorldCheck("1")
                    .job("아모르파티")
                    .build());
        }
        return users.size()+"개 더미값 추가";
    }

    @Override
    public String join(UserDto join) {
        System.out.println("이름을 입력해주세요");
        users.put(join.getName(),join);
        System.out.println(users);
        return null;
    }


    @Override
    public UserDto login(UserDto login) {
        if (users.containsKey(login.getUsername())) {
            if(users.get(login.getUsername()).getPassWorld().equals(login.getPassWorld())){
                System.out.println(login.getUsername()+"님 로그인에 성공 했습니다.");
            }else{
                System.out.println(login.getUsername()+"님 로그인에 실패 했습니다.");
            }
        }else{
            System.out.println("로그인에 실패 했습니다1.");
        }
        return null;
}


    @Override
    public String findUserById(UserDto findUserById) {
        if(users.containsKey(findUserById.getUsername())){
            System.out.println("아이디가 사용 중 입니다.");
        }else{
            System.out.println("아이디가 없습니다.");
        }
        return null;
    }

    @Override
    public String updatePassword(UserDto updatePassword) {
        if (users.containsKey(updatePassword.getUsername())) {
            users.(updatePassword.getUsername();
        }
         return null;
    }

    @Override
    public String deleteUser(UserDto deleteUser) {
        users.remove(deleteUser.getUsername());
        return null;
    }

    @Override
    public String getUserList() {
            System.out.println(users);
            return null;
    }

    @Override
    public List<UserDto> findUsersByName(UserDto findUsersByName) {
        ArrayList<UserDto> lList = new ArrayList<>();
        for(int i=0; i<users.size();i++){
        for (String keys : users.keySet()) {
            UserDto rList = users.get(keys);
            if (findUsersByName.getUsername().compareTo(rList.getName()) == 0) lList.add(rList);
        }
        }
        System.out.println(lList);
        return lList;
    }

    @Override
    public List<UserDto> findUsersByJob(UserDto findUsersByJob) {
        ArrayList<UserDto> lList = new ArrayList<>();
        for (String keys : users.keySet()) {
            UserDto rList = users.get(keys);
            if (findUsersByJob.getUsername().compareTo(rList.getJob()) == 0) lList.add(rList);
        }
        System.out.println(lList);
        return lList;
    }

    @Override
    public String countUsers() {
        System.out.println("회원수 : " + users.size()+" 명");
        return String.valueOf(users.size());
    }
}
