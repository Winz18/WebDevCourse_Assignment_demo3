package hcmute.uni.demo_3.dto;

import lombok.Data;

@Data
public class SignUp {
    private String name;
    private String username;
    private String email;
    private String password;
    private boolean enabled;
}
