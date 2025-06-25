package behavioral_patterns.chain_of_responsibility.ex01;

/**
 * 양수 여부를 처리하는 Handler 구현 클래스
 */
public class PositiveHandler extends Handler {
    /**
     * 숫자가 양수인지 판별하여 메시지를 출력합니다.
     * @param number 처리할 숫자
     */
    @Override
    protected void process(int number) {
        // number가 0보다 크면 메시지 출력
        if (number > 0) {
            System.out.println(number + " is a positive number");
        }
    }
}
