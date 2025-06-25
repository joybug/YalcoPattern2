package behavioral_patterns.memento.ex02;

/**
 * Main 클래스는 문서 편집기의 상태 저장/복원(Memento 패턴) 예제를 실행합니다.
 */
public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();

        editor.write("Hello, ");
        editor.write("this is Memento pattern. ");
        System.out.println(editor.getContent());

        editor.undo();
        System.out.println(editor.getContent());

        editor.write("This is an example implemented in Java.");
        System.out.println(editor.getContent());
    }
}
