package solid_principles.interface_segregation.noncompliant;

/**
 * Main 클래스 - ISP 위반 사례 실행
 * Worker 인터페이스의 문제점을 보여주는 실행 클래스
 */
public class Main {
    /**
     * 메인 메서드
     * Employee와 Robot 객체를 생성하고 메서드 호출
     * @param args 명령행 인자
     */
    public static void main(String[] args) {
        // Employee 객체 생성 및 메서드 호출
        Worker employee = new Employee();
        employee.work(); // 정상 동작
        employee.eat();  // 정상 동작

        // Robot 객체 생성 및 메서드 호출
        Worker robot = new Robot();
        robot.work();    // 정상 동작
        robot.eat();     // 예외 발생 - 로봇은 먹을 수 없음
    }
}
