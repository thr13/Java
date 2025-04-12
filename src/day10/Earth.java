package src.day10;

public class Earth {
    /*
    상수는 객체마다 별도로 저장할 필요가 없고, 값을 여러개를 가지면 안되므로 static 이면서 final 인 특성을 가져야 한다
    static final 타입 상수이름 = 초기값; 또는 초기값을 static block 에서 초기화 할 수 있다
    상수 이름은 모두 대문자로 작성하고 언더바_ 를 사용해서 단어를 연결하는게 관례이다
     */
    static final double EARTH_RADIUS = 6400;
    static final double EARTH_SURFACE_AREA;

    static {
        EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
    }
}
