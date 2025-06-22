package solid_principles.interface_segregation.compliant;

/**
 * Main 클래스 - ISP 준수 사례 실행
 * 분리된 인터페이스 사용의 장점을 보여주는 실행 클래스
 */
public class Main {
    /**
     * 메인 메서드
     * Employee와 Robot 객체를 생성하고 적절한 인터페이스로 메서드 호출
     * @param args 명령행 인자
     */
    public static void main(String[] args) {
        // Employee 객체 생성 및 메서드 호출
        Workable employee = new Employee();
        employee.work(); // 작업 기능 실행
        ((Eatable) employee).eat(); // 식사 기능은 명시적 캐스팅 후 실행

        // Robot 객체 생성 및 메서드 호출
        Workable robot = new Robot();
        robot.work(); // 작업 기능만 실행 가능
        // 로봇은 Eatable 인터페이스를 구현하지 않아 캐스팅 불가
    }
}
