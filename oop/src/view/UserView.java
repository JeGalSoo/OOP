package view;

import controller.UserController;

import java.util.Scanner;

public class UserView {
    public static void main(Scanner sc) {
        UserController uc = new UserController();
        uc.addUsers();
        while(true){
            System.out.println("[메뉴] 0-종료\n " +
                    "1-회원가입\n " + "2-로그인\n " +
                    "3-ID검색\n 4-비번변경\n " +
                    "5-탈퇴\n 6-회원목록\n " +
                    "7-이름검색\n 8-직업검색\n 9-회원수");
            switch (sc.next()){
                case "0" :
                    System.out.println("종료");
                    return;
                case "1" :
                    uc.join(sc);
                    break;
                case "2" :
                    uc.login(sc);
                    break;
                case "3" :
                    uc.findUserById(sc);
                    break;
                case "4" :
                    uc.updatePassword(sc);
                    break;
                case "5" :
                    uc.deleteUser(sc);
                    break;
                case "6" :
                    uc.getUserList();
                    break;
                case "7" :
                    uc.findUsersByName(sc);
                    break;
                case "8" :
                    break;
                case "9" :
                    uc.countUsers();
                    break;
            }
        }
    }
}
