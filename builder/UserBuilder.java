package builder;
import model.UserDto;

public class UserBuilder {
    private String id;
    private String passWorld;
    private String passWorldCheck;
    private String name;
    private int sso;
    private int phoneNumber;
    private String address;
    private String job;
    private double height;
    private int weight;
    private double bmi;
    private String bodyMath;
    private int randomWeight;
    private double randomHeight;

    public UserBuilder name(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder id(String id) {
        this.id = id;
        return this;
    }

    public UserBuilder passWorld(String passWorld) {
        this.passWorld = passWorld;
        return this;
    }

    public UserBuilder passWorldCheck(String passWorldCheck) {
        this.passWorldCheck = passWorldCheck;
        return this;
    }

    public UserBuilder sso(int sso) {
        this.sso = sso;
        return this;
    }

    public UserBuilder phoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public UserBuilder address(String address) {
        this.address = address;
        return this;
    }

    public UserBuilder job(String job) {
        this.job = job;
        return this;
    }

    public UserBuilder height(double height) {
        this.height = height;
        return this;
    }

    public UserBuilder weight(int weight) {
        this.weight = weight;
        return this;
    }

    public UserBuilder bmi(double bmi) {
        this.bmi = bmi;
        return this;
    }

    public UserBuilder bodyMath(String bodyMath) {
        this.bodyMath = bodyMath;
        return this;
    }

    public UserBuilder randomWeight(int randomWeight) {
        this.randomWeight = randomWeight;
        return this;
    }

    public UserBuilder randomHeight(double randomHeight) {
        this.randomHeight = randomHeight;
        return this;
    }

    public UserDto build() {
        return new UserDto(name, id, passWorld, passWorldCheck, sso, phoneNumber, address, job, height, weight, bmi, bodyMath, randomWeight, randomHeight);
    }

}
