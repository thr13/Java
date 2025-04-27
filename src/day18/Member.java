package src.day18;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
//@NoArgsConstructor
@AllArgsConstructor
public class Member {
    private final String id; // @NoArgsConstructor 가 있다면 final 필드가 초기화 되지 않을 경우 컴파일 에러 발생한다
    @NonNull
    String name;
    private int age;

    /*
    public Member(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member target) {
            if (id.equals(target.id)) {
                return true;
            }
        }
        return false;
    }
    */
}
