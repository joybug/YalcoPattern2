package structural_patterns.flyweight.ex01;

// Book 클래스는 책 객체를 나타내며, Flyweight 패턴에서 공유되는(공통) 상태를 가집니다.
// title(제목)은 intrinsic state로 여러 곳에서 공유될 수 있습니다.
public class Book {
    // 책의 제목(공유 상태)
    private final String title; // intrinsic state (shared)

    // 생성자: 책 제목을 받아 Book 객체를 생성합니다.
    public Book(String title) {
        // 전달받은 제목을 title에 저장합니다.
        this.title = title;
    }

    // 책을 읽는 동작을 수행하는 메소드입니다.
    public void read() {
        // 책 제목과 함께 읽고 있다는 메시지를 출력합니다.
        System.out.println("Reading the book titled: " + title);
    }
}
