package prototype.ex02;

/**
 * 문서를 나타내는 인터페이스입니다.
 * 프로토타입 패턴을 위한 Prototype을 상속받고,
 * 문서의 기본 동작을 정의합니다.
 */
public interface Document extends Prototype {
    /**
     * 문서의 내용을 설정하는 메소드입니다.
     * @param content 설정할 문서 내용
     */
    void setContent(String content);

    /**
     * 문서의 현재 내용을 반환하는 메소드입니다.
     * @return 문서의 현재 내용
     */
    String getContent();
}
