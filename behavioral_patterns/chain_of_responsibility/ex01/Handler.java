package behavioral_patterns.chain_of_responsibility.ex01;

/**
 * Handler 추상 클래스
 * 체인 상의 각 처리 객체의 공통 기능을 정의합니다.
 */
public abstract class Handler {
    /**
     * 다음 처리자를 가리키는 참조 변수
     */
    protected Handler next;

    /**
     * 다음 처리자를 설정하는 메서드
     * @param next 다음 Handler 객체
     */
    public void setNext(Handler next) {
        // 다음 처리자를 연결합니다.
        this.next = next;
    }

    /**
     * 요청을 처리하는 메서드
     * @param number 처리할 숫자
     */
    public void handle(int number) {
        // 현재 객체가 처리할 수 있는지 확인 후 처리
        process(number);
        // 다음 처리자가 있으면 체인을 따라 요청을 전달
        if (next != null) next.handle(number);
    }

    /**
     * 실제 처리를 담당하는 추상 메서드
     * 하위 클래스에서 구체적으로 구현합니다.
     */
    protected abstract void process(int number);
}
