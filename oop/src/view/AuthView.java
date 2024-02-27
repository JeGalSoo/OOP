package view;

import controller.AuthController;
import controller.UserController;
import java.util.Scanner;

public class AuthView {
    public static void main( Scanner sc) {
        AuthController ctrl = new AuthController();
        ctrl.addUsers();
        while(true){
            System.out.println("[메뉴] 0-종료\n " +
                    "1-ID검색\n " +
                    "2-회원목록\n " +
                    "3-회원수\n" +
                    "4-회원수\n" +
                    "5-회원수\n" +
                    "6-회원정보");
            switch (sc.next()){
                case "0":
                    System.out.println("종료");
                    return;
                case "3":
                    System.out.println("===회원수===");
                    ctrl.count();
                    return;
                case "6":
                    System.out.println("=== 회원목록 ===");
                    ctrl.memberList();
                    break;

            }

        }

    }
}