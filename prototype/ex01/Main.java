package prototype.ex01;

/**
 * Person 클래스의 프로토타입 패턴 사용 예제를 보여주는 실행 클래스입니다.
 */
public class Main {
    /**
     * 프로그램의 진입점입니다.
     * Person 객체를 생성하고 복제하여 프로토타입 패턴을 시연합니다.
     * @param args 명령행 인자
     */
    public static void main(String[] args) {
        // 1. 원본 Person 객체 생성 - 이름, 나이, 주소 정보 설정
        Person original = new Person("John", 30, "123 Main St");
        
        // 2. 원본 객체의 현재 정보 출력
        original.displayInfo();

        // 3. 원본 객체를 복제하여 새로운 Person 객체 생성
        Person cloned = original.clone();
        
        // 4. 복제된 객체의 주소만 새로운 값으로 변경
        cloned.setAddress("456 Clone St");

        // 5. 복제 및 수정 후 상태 출력 메시지
        System.out.println("\nAfter cloning and modifying the clone:");
        
        // 6. 원본 객체의 정보 출력 - 변경되지 않음을 확인
        original.displayInfo();
        
        // 7. 복제된 객체의 정보 출력 - 주소만 변경되었음을 확인
        cloned.displayInfo();
    }
}
