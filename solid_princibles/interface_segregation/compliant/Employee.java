package solid_princibles.interface_segregation.compliant;

/**
 * Employee 클래스 - Workable과 Eatable 인터페이스 구현
 * ISP를 준수하는 예제
 * 필요한 기능에 대한 인터페이스만 구현
 */
public class Employee implements Workable, Eatable {
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
