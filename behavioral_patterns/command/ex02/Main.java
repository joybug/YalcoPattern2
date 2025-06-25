package behavioral_patterns.command.ex02;

/**
 * Main 클래스는 Command 패턴을 사용하는 텍스트 에디터의 실행 예제를 보여줍니다.
 * 텍스트 삽입, 삭제, 실행 취소, 재실행 등의 기능을 테스트합니다.
 */
public class Main {
    /**
     * 프로그램의 진입점입니다.
     * Command 패턴을 사용한 텍스트 편집 기능을 시연합니다.
     * @param args 명령행 인자
     */
    public static void main(String[] args) {
        // 텍스트 편집기와 명령 실행자 객체 생성
        TextEditor editor = new TextEditor();
        TextEditorInvoker invoker = new TextEditorInvoker();

        // "Hello, " 텍스트를 처음 위치(0)에 삽입하는 명령 실행
        Command insertHello = new InsertTextCommand(editor, "Hello, ", 0);
        invoker.executeCommand(insertHello);

        // "World!" 텍스트를 7번째 위치에 삽입하는 명령 실행
        Command insertWorld = new InsertTextCommand(editor, "World!", 7);
        invoker.executeCommand(insertWorld);

        // 현재 텍스트 내용 출력 ("Hello, World!")
        System.out.println("Current text: " + editor.getContent());

        // 마지막 명령(World! 삽입) 취소
        invoker.undo();
        System.out.println("After undo: " + editor.getContent());

        // 취소된 명령(World! 삽입) 재실행
        invoker.redo();
        System.out.println("After redo: " + editor.getContent());

        // "Hello, " 텍스트를 삭제하는 명령 실행
        Command deleteCommand = new DeleteTextCommand(editor, 0, 7);
        invoker.executeCommand(deleteCommand);
        System.out.println("After delete: " + editor.getContent());

        // 삭제 명령 취소
        invoker.undo();
        System.out.println("Final text: " + editor.getContent());
    }
}
