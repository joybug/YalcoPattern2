package solid_principles.interface_segregation.compliant;

/**
 * Eatable 인터페이스
 * ISP를 준수하는 식사 관련 인터페이스
 * 식사 기능만을 담당하는 단일 책임 인터페이스
 */
public interface Eatable {
    /**
     * 식사를 하는 메서드
     * 식사가 가능한 객체만 구현
     */
    void eat();
}
