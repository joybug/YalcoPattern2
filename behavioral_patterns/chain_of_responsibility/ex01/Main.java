package behavioral_patterns.chain_of_responsibility.ex01;

/**
 * 체인 오브 리스폰서빌리티 패턴 예제의 메인 클래스
 */
public class Main {
    /**
     * 프로그램의 시작점(main 메서드)
     * @param args 커맨드라인 인자
     */
    public static void main(String[] args) {
        // 각 Handler 객체 생성
        Handler positive = new PositiveHandler();
        Handler even = new EvenHandler();
        Handler divisibleBy3 = new DivisibleBy3Handler();

        // 체인 연결: 양수 → 짝수 → 3의 배수
        positive.setNext(even);
        even.setNext(divisibleBy3);

        // 다양한 숫자에 대해 체인 처리 실행
        positive.handle(-2); // 음수, 짝수
        positive.handle(4);  // 양수, 짝수
        positive.handle(6);  // 양수, 짝수, 3의 배수
    }
}
