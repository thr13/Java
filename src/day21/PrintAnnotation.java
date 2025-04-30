package src.day21;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD}) // 적용대상: 메소드
@Retention(RetentionPolicy.RUNTIME) // 유지정책: RUNTIME(실행할때 적용되고 계속유지)
public @interface PrintAnnotation {
    String value() default "-"; // 기본속성 value 의 기본값을 - 로 설정함
    int number() default 15;
}
