package behavioral_patterns.chain_of_responsibility.ex01;

/**
 * 3의 배수 여부를 처리하는 Handler 구현 클래스
 */
public class DivisibleBy3Handler extends Handler {
    /**
     * 숫자가 3의 배수인지 판별하여 메시지를 출력합니다.
     * @param number 처리할 숫자
     */
    @Override
    protected void process(int number) {
        // number가 3의 배수이면 메시지 출력
        if (number % 3 == 0) {
            System.out.println(number + " is divible by 3");
        }
    }
}
