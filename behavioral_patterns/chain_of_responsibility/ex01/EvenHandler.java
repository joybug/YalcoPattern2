package behavioral_patterns.chain_of_responsibility.ex01;

/**
 * 짝수 여부를 처리하는 Handler 구현 클래스
 */
public class EvenHandler extends Handler {
    /**
     * 숫자가 짝수인지 판별하여 메시지를 출력합니다.
     * @param number 처리할 숫자
     */
    @Override
    protected void process(int number) {
        // number가 짝수이면 메시지 출력
        if (number % 2 == 0) {
            System.out.println(number + " is an even number");
        }
    }
}
