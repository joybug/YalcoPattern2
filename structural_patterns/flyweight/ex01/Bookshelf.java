package structural_patterns.flyweight.ex01;

import java.util.HashMap;
import java.util.Map;

// Bookshelf 클래스는 Book 객체를 관리하는 FlyweightFactory 역할을 합니다.
// 동일한 제목의 책은 한 번만 생성해서 여러 번 재사용합니다.
public class Bookshelf {
    // 책 제목을 키로 하여 Book 객체를 저장하는 Map입니다.
    private static final Map<String, Book> bookshelf = new HashMap<>();

    // 책 제목을 받아 Book 객체를 반환합니다.
    // 이미 존재하면 기존 객체를, 없으면 새로 생성해서 반환합니다.
    public static Book getBook(String title) {
        // 제목으로 책을 찾습니다.
        Book book = bookshelf.get(title);

        if (book == null) {
            // 책이 없으면 새로 생성해서 Map에 저장합니다.
            book = new Book(title);
            bookshelf.put(title, book);
            System.out.println(
                "Adding a new book to the bookshelf: " + title);
        } else {
            // 이미 있으면 재사용합니다.
            System.out.println(
                "Reusing existing book from the bookshelf: " + title);
        }
        // Book 객체를 반환합니다.
        return book;
    }
}
