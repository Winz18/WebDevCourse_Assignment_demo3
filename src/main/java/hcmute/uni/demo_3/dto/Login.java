package hcmute.uni.demo_3.dto;

import lombok.Data;

@Data
public class Login {
    private String usernameOrEmail;
    private String password;
}
