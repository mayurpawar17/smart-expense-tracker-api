package mayur.dev.smartexpensetackerapi.auth.dto;

import lombok.Data;

@Data
public class LogoutRequest {
    private String refreshToken;
}