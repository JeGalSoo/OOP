package service;

import model.User;

public interface KaupService {
    //여기있는거는 구현 의무 사항들, 안하면 에러 뜸
    String creatBmi(User user);
    String creatBodyMath(String bmi);
}
