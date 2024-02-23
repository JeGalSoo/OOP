package view;
import builder.UserBuilder;
import model.UserDto;
import java.util.Scanner;
public class JoinView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름,아이디,비번,비번확인,주번,폰번,주소,직업,키,몸무게를 입력해주세요");
        UserDto user = new UserBuilder()
                .name(sc.next())
                .id(sc.next())
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
    }
}
