package solid_princibles.interface_segregation.noncompliant;

/**
 * Employee 클래스 - Worker 인터페이스 구현
 * 일반 직원을 나타내는 클래스
 * work()와 eat() 모두 의미 있게 구현 가능
 */
public class Employee implements Worker {
    /**
     * Employee의 작업 수행 메서드
     * 직원이 작업하는 것을 콘솔에 출력
     */
    @Override
    public void work() {
        // 직원의 작업 수행을 콘솔에 출력
        System.out.println("Employee is working");
    }

    /**
     * Employee의 식사 메서드
     * 직원이 식사하는 것을 콘솔에 출력
     */
    @Override
    public void eat() {
        // 직원의 식사 행위를 콘솔에 출력
        System.out.println("Employee is eating");
    }
}
