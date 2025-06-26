package behavioral_patterns.command.ex02;

/**
 * InsertTextCommand 클래스는 텍스트 삽입 명령을 구현하는 구체적인 Command 클래스입니다.
 * Command 인터페이스를 구현하여 텍스트 삽입과 관련된 실행 및 취소 기능을 제공합니다.
 */
public class InsertTextCommand implements Command {
    // 텍스트 편집기 참조를 저장하는 변수
    private TextEditor editor;
    // 삽입할 텍스트
    private String text;
    // 텍스트를 삽입할 위치
    private int position;
    
    /**
     * InsertTextCommand 생성자
     * @param editor 텍스트 편집기 객체
     * @param text 삽입할 텍스트
     * @param position 텍스트를 삽입할 위치
     */
    public InsertTextCommand(TextEditor editor, String text, int position) {
        // 전달받은 인자를 멤버 변수에 저장
        this.editor = editor;
        this.text = text;
        this.position = position;
    }

    /**
     * 텍스트 삽입 명령을 실행합니다.
     * 지정된 위치에 텍스트를 삽입합니다.
     */
    @Override
    public void execute() {
        // 편집기의 insertText 메서드 호출
        editor.insertText(text, position);
    }

    /**
     * 텍스트 삽입 명령을 취소합니다.
     * 삽입된 텍스트를 제거하여 이전 상태로 되돌립니다.
     */
    @Override
    public void undo() {
        // 편집기의 deleteText 메서드 호출
        editor.deleteText(position, text.length());
    }
}
