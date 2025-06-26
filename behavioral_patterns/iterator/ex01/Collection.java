package behavioral_patterns.iterator.ex01;

/**
 * 컬렉션의 공통 동작을 정의하는 인터페이스입니다.
 * @param <T> 컬렉션의 요소 타입
 */
public interface Collection<T> {
    /**
     * 컬렉션에 요소를 추가합니다.
     * @param item 추가할 요소
     */
    void add(T item);

    /**
     * 컬렉션의 요소 개수를 반환합니다.
     * @return 요소 개수
     */
    int size();

    /**
     * 컬렉션을 순회할 수 있는 Iterator를 반환합니다.
     * @return Iterator 객체
     */
    MyIterator<T> iterator();
}
