package behavioral_patterns.command.ex02;

/**
 * TextEditor 클래스는 Command 패턴에서 Receiver 역할을 합니다.
 * 실제 텍스트 편집 작업을 수행하는 클래스입니다.
 */
public class TextEditor {
    // 텍스트 내용을 저장하는 StringBuilder 객체
    private StringBuilder content;

    /**
     * TextEditor 생성자
     * 빈 StringBuilder를 생성하여 초기화합니다.
     */
    public TextEditor() {
        // 빈 문자열로 초기화
        this.content = new StringBuilder();
    }

    /**
     * 지정된 위치에 텍스트를 삽입하는 메서드
     * @param text 삽입할 텍스트
     * @param position 삽입할 위치
     */
    public void insertText(String text, int position) {
        // StringBuilder의 insert 메서드 사용
        content.insert(position, text);
    }

    /**
     * 지정된 위치에서 특정 길이만큼의 텍스트를 삭제하는 메서드
     * @param position 삭제 시작 위치
     * @param length 삭제할 텍스트의 길이
     */
    public void deleteText(int position, int length) {
        // StringBuilder의 delete 메서드 사용
        content.delete(position, position + length);
    }

    /**
     * 지정된 범위의 텍스트를 반환하는 메서드
     * @param start 시작 위치
     * @param end 끝 위치
     * @return 지정된 범위의 텍스트
     */
    public String getTextSubstring(int start, int end) {
        // StringBuilder의 substring 메서드 사용
        return content.substring(start, end);
    }

    /**
     * 현재 편집기의 전체 텍스트 내용을 반환하는 메서드
     * @return 전체 텍스트 내용
     */
    public String getContent() {
        // StringBuilder의 toString 메서드 사용
        return content.toString();
    }
}
