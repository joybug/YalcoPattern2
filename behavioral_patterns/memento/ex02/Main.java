package behavioral_patterns.memento.ex02;

/**
 * Main 클래스는 문서 편집기의 상태 저장/복원(Memento 패턴) 예제를 실행합니다.
 * 텍스트 추가, undo(되돌리기) 기능을 시연합니다.
 */
public class Main {
    /**
     * 프로그램의 시작점입니다.
     * @param args 커맨드라인 인자(사용하지 않음)
     */
    public static void main(String[] args) {
        // 편집기 객체 생성
        Editor editor = new Editor();

        // 텍스트 추가
        editor.write("Hello, ");
        editor.write("this is Memento pattern. ");
        System.out.println(editor.getContent()); // 현재 내용 출력

        // undo(되돌리기) 실행
        editor.undo();
        System.out.println(editor.getContent()); // 이전 내용 출력

        // 텍스트 추가
        editor.write("This is an example implemented in Java.");
        System.out.println(editor.getContent()); // 최종 내용 출력
    }
}
