package abstract_factory.ex01;

/**
 * Abstract Product - 체크박스
 * - GUI 체크박스에 대한 추상 인터페이스
 */
public interface Checkbox {
    /**
     * 체크박스 렌더링 메서드
     * - 각 OS 스타일에 맞게 체크박스를 화면에 그림
     */
    void paint();
}
