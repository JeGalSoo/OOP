package view;
import builder.UserBuilder;
import model.UserDto;
import service.KaupService;
import service.UtilService;
import serviceImpl.KaupServiceImpl;
import serviceImpl.UtilServiceImpl;
import java.util.Scanner;
public class KaupView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UtilService util = UtilServiceImpl.getInstance();
        KaupService service = KaupServiceImpl.getInstance();
        UserDto ud = new UserBuilder() //Dto = Data Transport Object
                .height(util.createRandomDouble(150, 50))
                .weight(util.createRandomInteger(30, 70))
                .build();
        KaupService kaup = KaupServiceImpl.getInstance();

        String bmi = kaup.creatBmi(ud);
        String bodyMass = kaup.creatBodyMath(bmi);

        System.out.printf("키 : %.1f m, 몸무게 : %d kg \n" +
                "bmi지수는 : %s" +
                "\n체질량 : %s",
                ud.getHeight(),ud.getWeight(),bmi,bodyMass);
    }
}