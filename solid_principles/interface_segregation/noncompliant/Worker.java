package solid_principles.interface_segregation.noncompliant;

/**
 * Worker 인터페이스 - ISP를 위반하는 예제
 * 이 인터페이스는 모든 작업자(Worker)에 대한 메서드를 한꺼번에 정의함
 * 문제점: Robot과 같은 일부 구현체는 eat() 메서드가 불필요함
 */
public interface Worker {
    /**
     * 작업을 수행하는 메서드
     * 모든 작업자가 구현해야 함
     */
    void work();
    
    /**
     * 식사를 하는 메서드
     * 사람 작업자만 필요한 메서드이지만 모든 구현체가 구현해야 함
     */
    void eat();
}
