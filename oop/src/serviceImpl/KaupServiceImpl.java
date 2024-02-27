package serviceImpl;
import model.UserDto;
import service.KaupService;


public class KaupServiceImpl implements KaupService {

    private static KaupService instance = new KaupServiceImpl();
    private KaupServiceImpl(){} //디폴트 생성자를 막음
    public static KaupService getInstance() {
        return instance;
    }
    @Override
    public String creatBmi(UserDto user) {
        double height = user.getHeight()/100;
        double weight = user.getWeight();
        double bmi = (weight/(height*2));
        return String.valueOf((bmi)).substring(0,4);//키/몸무게^2
    }
    @Override
    public String creatBodyMath(String bmi) {
        String bmi2 = "";
        double bodyMath = Double.parseDouble(bmi);
        if(bodyMath<18.5) {
            bmi2 = "저체중";
        }else if(bodyMath<23){
            bmi2 = "정상";
        }else if(bodyMath<25){
            bmi2 = "과체중";
        }else{
            bmi2 = "비만";
        }
        return bmi2;//18.5저체중,23정상,25과체중,비만
    }
}