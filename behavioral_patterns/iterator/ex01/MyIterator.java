package behavioral_patterns.iterator.ex01;

/**
 * MyIterator 인터페이스는 컬렉션을 순회하는 표준 메서드를 정의합니다.
 */
interface MyIterator {
    /**
     * 다음 요소가 존재하는지 확인합니다.
     * @return 다음 요소가 있으면 true
     */
    boolean hasNext();

    /**
     * 다음 요소를 반환합니다.
     * @return 다음 요소 객체
     */
    Object next();
}
