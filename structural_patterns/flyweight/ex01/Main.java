package structural_patterns.flyweight.ex01;

// Main 클래스는 Bookshelf와 Book의 동작을 테스트하는 실행 진입점입니다.
public class Main {
    // 프로그램의 시작점인 main 메소드입니다.
    public static void main(String[] args) {
        // "Effective Java" 책을 Bookshelf에서 가져와 읽습니다.
        Book book1 = Bookshelf.getBook("Effective Java");
        book1.read();

        // 같은 제목의 책을 다시 가져오면 기존 객체를 재사용합니다.
        Book book2 = Bookshelf.getBook("Effective Java");
        book2.read();

        // "Clean Code" 책을 Bookshelf에서 가져와 읽습니다.
        Book book3 = Bookshelf.getBook("Clean Code");
        book3.read();

        // book1과 book2가 같은 객체인지 확인합니다.
        System.out.println(
            book1 == book2 ? "Same book for 'Effective Java'."
            : "Different books for 'Effective Java'."
        );
    }
}
