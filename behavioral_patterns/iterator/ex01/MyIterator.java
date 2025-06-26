package behavioral_patterns.iterator.ex01;

/**
 * 컬렉션을 순회(iteration)할 수 있는 Iterator 인터페이스입니다.
 * @param <T> 컬렉션의 요소 타입
 */
public interface MyIterator<T> {
    /**
     * 다음 요소가 존재하는지 확인합니다.
     * @return 다음 요소가 있으면 true, 없으면 false
     */
    boolean hasNext();

    /**
     * 다음 요소를 반환합니다.
     * @return 다음 요소
     */
    T next();
}
