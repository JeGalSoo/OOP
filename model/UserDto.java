package model;

public class UserDto {
    @Override
    public String toString() {
        return "UserDto{" +
                "id='" + id + '\'' +
                ", passWorld='" + passWorld + '\'' +
                ", passWorldCheck='" + passWorldCheck + '\'' +
                ", name='" + name + '\'' +
                ", sso=" + sso +
                ", phoneNumber=" + phoneNumber +
                ", address='" + address + '\'' +
                ", job='" + job + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", bmi=" + bmi +
                ", bodyMath='" + bodyMath + '\'' +
                ", randomWeight=" + randomWeight +
                ", randomHeight=" + randomHeight +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassWorld() {
        return passWorld;
    }

    public void setPassWorld(String passWorld) {
        this.passWorld = passWorld;
    }

    public String getPassWorldCheck() {
        return passWorldCheck;
    }

    public void setPassWorldCheck(String passWorldCheck) {
        this.passWorldCheck = passWorldCheck;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSso() {
        return sso;
    }

    public void setSso(int sso) {
        this.sso = sso;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public String getBodyMath() {
        return bodyMath;
    }

    public void setBodyMath(String bodyMath) {
        this.bodyMath = bodyMath;
    }
    public int getRandomWeight() {
        return randomWeight;
    }
    public void setRandomWeight(int randomWeight) {
        this.randomWeight = randomWeight;
    }

    public double getRandomHeight() {
        return randomHeight;
    }
    public void setRandomHeight(double randomHeight) {
        this.randomHeight = randomHeight;
    }


    public UserDto(String name, String id, String passWorld, String passWorldCheck, int sso, int phoneNumber, String address, String job, double height, int weight, double bmi, String bodyMath, int randomWeight, double randomHeight) {
        this.name = name;
        this.id = id;
        this.passWorld = passWorld;
        this.passWorldCheck = passWorldCheck;
        this.sso = sso;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.job = job;
        this.height = height;
        this.weight = weight;
        this.bmi = bmi;
        this.bodyMath = bodyMath;
    }

    private String name;
    private String id;
    private String passWorld;
    private String passWorldCheck;
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




}
