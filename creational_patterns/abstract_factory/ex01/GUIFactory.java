package abstract_factory.ex01;

/**
 * GUI 팩토리 인터페이스 - 추상 팩토리 패턴의 핵심
 * 
 * 추상 팩토리 패턴이란?
 * - 관련된 객체들의 집합을 생성하기 위한 인터페이스를 제공하는 패턴
 * - 예: Windows나 MacOS의 GUI 컴포넌트들을 각각의 스타일에 맞게 생성
 * 
 * 주요 특징:
 * 1. 관련된 객체군을 함께 생성 (버튼과 체크박스는 같은 스타일이어야 함)
 * 2. 구체적인 클래스에 의존하지 않음 (WindowsButton이나 MacOSButton을 직접 참조하지 않음)
 * 3. 제품군의 교체가 용이 (Windows ↔ MacOS 전환이 쉬움)
 */
public interface GUIFactory {
    /**
     * 버튼 생성 메서드
     * - 각 운영체제에 맞는 스타일의 버튼 객체를 생성
     * - Windows의 경우 WindowsButton, MacOS의 경우 MacOSButton을 반환
     * @return 생성된 Button 객체
     */
    Button createButton();

    /**
     * 체크박스 생성 메서드
     * - 각 운영체제에 맞는 스타일의 체크박스 객체를 생성
     * - Windows의 경우 WindowsCheckbox, MacOS의 경우 MacOSCheckbox를 반환
     * @return 생성된 Checkbox 객체
     */
    Checkbox createCheckbox();
}
