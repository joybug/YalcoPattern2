package solid_princibles.open_closed.compliant;

/**
 * 리포트 생성을 위한 기본 인터페이스
 * 확장에는 열려있고 수정에는 닫혀있는 구조를 제공
 */
public interface Report {
    /**
     * 리포트를 생성하는 추상 메소드
     * 각 구현체에서 자신의 형식에 맞게 구현
     */
    void generate();
}
