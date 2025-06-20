package prototype.ex02;

/**
 * Document 인터페이스를 구현하는 텍스트 문서 클래스입니다.
 * 문자열 형태의 내용을 관리하고 복제할 수 있습니다.
 */
public class TextDocument implements Document {
    // 문서의 내용을 저장하는 필드
    private String content;

    /**
     * 새로운 TextDocument 객체를 생성하는 생성자입니다.
     * @param content 문서의 초기 내용
     */
    public TextDocument(String content) {
        // 초기 내용 설정
        this.content = content;
    }

    /**
     * 현재 문서의 복제본을 생성합니다.
     * @return 현재 문서와 동일한 내용을 가진 새로운 TextDocument 객체
     */
    @Override
    public Document clone() {
        // 현재 내용을 가진 새로운 TextDocument 객체 생성 및 반환
        return new TextDocument(this.content);
    }

    /**
     * 문서의 내용을 설정합니다.
     * @param content 설정할 새로운 내용
     */
    @Override
    public void setContent(String content) {
        // 새로운 내용으로 업데이트
        this.content = content;
    }

    /**
     * 문서의 현재 내용을 반환합니다.
     * @return 문서의 현재 내용
     */
    @Override
    public String getContent() {
        // 현재 저장된 내용 반환
        return content;
    }
}
