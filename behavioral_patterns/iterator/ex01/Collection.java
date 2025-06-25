package behavioral_patterns.iterator.ex01;

/**
 * Collection 인터페이스는 Iterator를 생성하는 메서드를 정의합니다.
 */
interface Collection {
    /**
     * 컬렉션에 대한 Iterator를 생성합니다.
     * @return MyIterator 객체
     */
    MyIterator createIterator();
}
