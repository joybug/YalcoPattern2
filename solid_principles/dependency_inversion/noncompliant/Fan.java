package solid_principles.dependency_inversion.noncompliant;

/**
 * Fan 클래스 (비준수 예시)
 * DIP(의존성 역전 원칙)을 지키지 않은 저수준 모듈입니다.
 * Switch에서 직접 Fan 객체의 메서드를 호출합니다.
 * 
 * - spin(): 선풍기를 켭니다.
 * - stop(): 선풍기를 끕니다.
 */
public class Fan {
    /**
     * 선풍기를 켜는 메서드
     */
    public void spin() {
        // 실제로 선풍기가 켜졌음을 출력
        System.out.println("Fan is spinning");
    }

    /**
     * 선풍기를 끄는 메서드
     */
    public void stop() {
        // 실제로 선풍기가 꺼졌음을 출력
        System.out.println("Fan is stopping");
    }
}
