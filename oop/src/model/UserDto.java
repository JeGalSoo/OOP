package model;
import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDto {
    private String username;
    private String name;
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

}
