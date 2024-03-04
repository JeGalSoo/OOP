package serviceImpl;
import lombok.Getter;
import model.User;
import service.UserService;
import service.UtilService;

import java.util.*;
//id pw pw 94 12 ad jo 123 321
public class UserServiceImpl implements UserService {
    @Getter
    private static UserService instance = new UserServiceImpl();
    Map<String, User> users;
    boolean check=false;
    public UserServiceImpl(){//디폴트 생성자를 막음
        users = new HashMap<>();
    }

    @Override
    public String addUsers() {
        UtilService ut= UtilServiceImpl.getInstance();
        for(int i=0;i<5;i++) {
            String username=UtilServiceImpl.getInstance().createRandomUsername();
            users.put(username, User.builder()
                    .username(username)
                    .name(ut.createRandomUsername())
                    .password("1")
                    .password("1")
                    .job("아모르파티")
                    .build());
        }
        return users.size()+"개 더미값 추가";
    }

    @Override
    public String join(User join) {
        System.out.println("이름을 입력해주세요");
        users.put(join.getUsername(),join);
        System.out.println(users);
        return null;
    }


    @Override
    public User login(User login) {
        System.out.println(login.getUsername());
        System.out.println(login.getName());
        if (users.containsKey(login.getUsername())) {
            if(users.get(login.getUsername()).getPassword().equals(login.getPassword())){
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
    public String findUserById(User findUserById) {
        if(users.containsKey(findUserById.getUsername())){
            System.out.println("아이디가 사용 중 입니다.");
        }else{
            System.out.println("아이디가 없습니다.");
        }
        return null;
    }

    @Override
    public String updatePassword(User updatePassword) {
        if (users.containsKey(updatePassword.getUsername())) {

            users.put(updatePassword.getUsername(), User.builder()
                    .password(updatePassword.getPassword())
                    .build());
        }
        return null;
    }

    @Override
    public String deleteUser(User deleteUser) {
        users.remove(deleteUser.getUsername());
        return null;
    }

    @Override
    public String getUserList() {
            System.out.println(users);
            return null;
    }

    @Override
    public List<User> findUsersByName(User findUsersByName) {
        ArrayList<User> lList = new ArrayList<>();
        for (String keys : users.keySet()) {
            User rList = users.get(keys);
            if (findUsersByName.getName().compareTo(rList.getName()) == 0) lList.add(rList);
        }
        System.out.println(lList);
        return lList;
    }

    @Override
    public List<User> findUsersByJob(User findUsersByJob) {
        ArrayList<User> lList = new ArrayList<>();
        for (String keys : users.keySet()) {
            User rList = users.get(keys);
            if (findUsersByJob.getJob().compareTo(rList.getJob()) == 0) lList.add(rList);
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
