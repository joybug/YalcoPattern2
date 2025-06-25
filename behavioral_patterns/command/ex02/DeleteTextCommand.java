package behavioral_patterns.command.ex02;

/**
 * DeleteTextCommand 클래스는 텍스트 삭제 명령을 구현하는 구체적인 Command 클래스입니다.
 * Command 인터페이스를 구현하여 텍스트 삭제와 관련된 실행 및 취소 기능을 제공합니다.
 */
public class DeleteTextCommand implements Command {
    // 텍스트 편집기 참조를 저장하는 변수
    private TextEditor editor;
    // 삭제된 텍스트를 저장하는 변수 (undo를 위해 보관)
    private String deletedText;
    // 삭제가 시작되는 위치
    private int position;

    /**
     * DeleteTextCommand 생성자
     * @param editor 텍스트 편집기 객체
     * @param position 삭제할 텍스트의 시작 위치
     * @param length 삭제할 텍스트의 길이
     */
    public DeleteTextCommand(TextEditor editor, int position, int length) {
        this.editor = editor;
        this.position = position;
        // 삭제할 텍스트를 미리 저장 (undo를 위해)
        this.deletedText = editor.getTextSubstring(position, position + length);
    }

    /**
     * 텍스트 삭제 명령을 실행합니다.
     * 지정된 위치에서 저장된 텍스트 길이만큼 삭제합니다.
     */
    @Override
    public void execute() {
        editor.deleteText(position, deletedText.length());
    }

    /**
     * 텍스트 삭제 명령을 취소합니다.
     * 삭제된 텍스트를 원래 위치에 다시 삽입합니다.
     */
    @Override
    public void undo() {
        editor.insertText(deletedText, position);
    }
}
