package view;
import model.User;
import service.KaupService;
import service.UtilService;
import serviceImpl.KaupServiceImpl;
import serviceImpl.UtilServiceImpl;
import java.util.Scanner;
public class KaupView {
    public static void main(Scanner sc) {
        UtilService util = UtilServiceImpl.getInstance();
        KaupService service = KaupServiceImpl.getInstance();
        User ud=(User.builder())//Dto = Data Transport Object
                .height(util.createRandomDouble(150, 50))
                .weight(util.createRandomInteger(30, 70))
                .build();
        String bmi = service.creatBmi(ud);
        String bodyMass = service.creatBodyMath(bmi);

        System.out.printf("키 : %.1f m, 몸무게 : %d kg \n" +
                "bmi지수는 : %s" +
                "\n체질량 : %s",
                ud.getHeight(),ud.getWeight(),bmi,bodyMass);
    }
}