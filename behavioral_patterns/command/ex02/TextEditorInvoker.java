package behavioral_patterns.command.ex02;

import java.util.Stack;

/**
 * TextEditorInvoker 클래스는 Command 패턴에서 Invoker 역할을 합니다.
 * 명령의 실행, 실행 취소(undo), 재실행(redo) 기능을 관리합니다.
 */
public class TextEditorInvoker {
    // 실행 취소를 위한 명령 스택
    private Stack<Command> undoStack = new Stack<>();
    // 재실행을 위한 명령 스택
    private Stack<Command> redoStack = new Stack<>();

    /**
     * 새로운 명령을 실행하는 메서드
     * 명령을 실행하고 undo 스택에 추가하며, redo 스택은 초기화합니다.
     * @param command 실행할 Command 객체
     */
    public void executeCommand(Command command) {
        // 명령 실행
        command.execute();
        // undo 스택에 추가
        undoStack.push(command);
        // 새 명령이 실행되면 redo 스택은 초기화
        redoStack.clear();
    }

    /**
     * 가장 최근에 실행된 명령을 취소하는 메서드
     * undo 스택에서 명령을 꺼내어 취소하고, redo 스택에 추가합니다.
     */
    public void undo() {
        if (!undoStack.isEmpty()) {
            // undo 스택에서 명령 꺼내기
            Command command = undoStack.pop();
            // 명령 취소
            command.undo();
            // redo 스택에 추가
            redoStack.push(command);
        }
    }

    /**
     * 가장 최근에 취소된 명령을 재실행하는 메서드
     * redo 스택에서 명령을 꺼내어 다시 실행하고, undo 스택에 추가합니다.
     */
    public void redo() {
        if (!redoStack.isEmpty()) {
            // redo 스택에서 명령 꺼내기
            Command command = redoStack.pop();
            // 명령 재실행
            command.execute();
            // undo 스택에 추가
            undoStack.push(command);
        }
    }
}
