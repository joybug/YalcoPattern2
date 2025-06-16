package abstract_factory.ex01;

/**
 * Abstract Product - 버튼
 * - GUI 버튼에 대한 추상 인터페이스
 */
public interface Button {
    /**
     * 버튼 렌더링 메서드
     * - 각 OS 스타일에 맞게 버튼을 화면에 그림
     */
    void paint();
}