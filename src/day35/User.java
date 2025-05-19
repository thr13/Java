package src.day35;

import lombok.Data;

// DB 에 저장된 users 테이블 정보를 가져올 클래스
@Data
public class User {
    private String userId;
    private String userName;
    private String userPassword;
    private int userAge;
    private String userEmail;
}