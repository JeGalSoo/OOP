/*
package view;

import controller.AuthController;

import java.util.Scanner;

public class AuthView {
    public static void main( Scanner scanner) {
        AuthController ac = new AuthController();
        String msg = ac.addUsers();
        while(true){
            System.out.println("[관리자메뉴] 0-종료\n " +
                    "1-회원가입\n " +
                    "2-로그인\n " +
                    "3-ID검색\n " +
                    "4-비번변경\n" +
                    "5-탈퇴\n " +
                    "6-회원목록\n " +
                    "7-이름검색\n" +
                    "8-직업검색\n" +
                    "9-회원수");
            switch (scanner.next()){
                case "0":
                    System.out.println("종료");return;
                case "1":
                    System.out.println("1-회원가입");
                    ac.join();
                    break;
                case "2":
                    System.out.println("2-로그인");
                    ac.login(scanner);
                    break;
                case "3":
                    System.out.println("3-ID검색");
                    ac.findUserById(scanner);
                    break;
                case "4":
                    System.out.println("4-비번변경");
                    ac.findUserById(scanner);
                    break;
                case "5":
                    System.out.println("5-탈퇴");
                    ac.deleteUser(scanner);
                    break;
                case "6":
                    System.out.println("6-회원목록");
                    ac.getUserList();
                    break;
                case "7":
                    System.out.println("7-이름검색");
                    ac.findUsersByName(scanner);
                    break;
                case "8":
                    System.out.println("8-직업검색");
                    ac.findUsersByJob(scanner);
                    break;
                case "9":
                    System.out.println("9-회원수");
                    String numberOfUsers = ac.countUsers();
                    System.out.printf("회원수 : "+numberOfUsers);
                    break;


            }

        }

    }
}
*/
