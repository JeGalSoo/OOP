package serviceImpl;
import builder.UserBuilder;
import com.sun.jdi.Value;
import model.UserDto;
import service.UserService;
import service.UtilService;

import java.security.Key;
import java.util.*;
//id pw pw 94 12 ad jo 123 321
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
    public String addUsers() {
        UtilService ut= UtilServiceImpl.getInstance();
        for(int i=0;i<5;i++) {
            String username=UtilServiceImpl.getInstance().createRandomUsername();
            users.put(username, new UserBuilder()
                    .username(username)
                    .name(ut.createRandomUsername())
                    .passWorld("1")
                    .passWorldCheck("1")
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
    public UserDto login(Scanner sc) {
        String name1 = sc.next();
        if(users.containsKey(name1)){
            if(users.get(name1).equals(sc.next())){
                System.out.println(name1+"님 로그인에 성공 했습니다.");
            }else{
                System.out.println(name1+"님 로그인에 성공 했습니다.");
            }
        }else{
            System.out.println("로그인에 실패 했습니다1.");
        }
        return null;
    }

    @Override
    public String findUserById(Scanner sc) {
        String name1=sc.next();
        if(users.containsKey(name1)){
            System.out.println("아이디가 사용 중 입니다.");
        }else{
            System.out.println("아이디가 없습니다.");
        }
        return null;
    }

    @Override
    public void updatePassword(Scanner sc) {
        String name1 = sc.next();
        if (users.containsKey(name1)) {
            users.put(name1, new UserBuilder()
                    .passWorld(sc.next())
                    .build());
        }
    }

    @Override
    public void deleteUser(Scanner sc) {
        String name1 = sc.next();
        users.remove(name1);
    }

    @Override
    public void getUserList() {
            System.out.println(users);
    }

    @Override
    public List<UserDto> findUsersByName(String name) {
        ArrayList<UserDto> lList = new ArrayList<>();
        for (String keys : users.keySet()) {
            UserDto rList = users.get(keys);
            if (name.compareTo(rList.getName()) == 0) lList.add(rList);
        }
        System.out.println(lList);
        return lList;
    }

    @Override
    public List<UserDto> findUsersByJob() {
        return null;
    }

    @Override
    public int countUsers() {
        System.out.println("회원수 : " + users.size()+" 명");
        return users.size();
    }
}
