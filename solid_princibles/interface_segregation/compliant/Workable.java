package solid_princibles.interface_segregation.compliant;

/**
 * Workable 인터페이스
 * ISP를 준수하는 작업 관련 인터페이스
 * 작업 수행만을 담당하는 단일 책임 인터페이스
 */
public interface Workable {
    /**
     * 작업을 수행하는 메서드
     * 모든 작업 가능한 객체가 구현해야 함
     */
    void work();
}
