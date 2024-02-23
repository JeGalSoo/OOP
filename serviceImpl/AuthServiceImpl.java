package serviceImpl;

import service.AuthService;
import service.UtilService;

public class AuthServiceImpl implements AuthService {
    private static AuthService instance = new AuthServiceImpl();
    private AuthServiceImpl(){} //디폴트 생성자를 막음
    public static AuthService getInstance() {
        return instance;
    }
    @Override
    public String logIn() {
        return null;
    }

    @Override
    public String join() {
        return null;
    }
}
