package abstract_factory.ex01;

/**
 * Abstract Factory 인터페이스
 * - GUI 컴포넌트들을 생성하는 추상 팩토리 역할
 * - 서로 관련된 객체들의 패밀리를 생성하기 위한 인터페이스 정의
 */
public interface GUIFactory {
    /**
     * 버튼 생성 메서드
     * @return 구체적인 OS 스타일의 버튼 인스턴스
     */
    Button createButton();

    /**
     * 체크박스 생성 메서드
     * @return 구체적인 OS 스타일의 체크박스 인스턴스
     */
    Checkbox createCheckbox();
}
