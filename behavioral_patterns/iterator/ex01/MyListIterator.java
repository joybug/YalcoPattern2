package behavioral_patterns.iterator.ex01;

/**
 * MyList 컬렉션을 순회하는 Iterator 구현체입니다.
 *
 * @param <T> 리스트의 요소 타입
 */
public class MyListIterator<T> implements MyIterator<T> {
    /**
     * 순회할 리스트 객체입니다.
     */
    private final MyList<T> list;
    /**
     * 현재 순회 중인 인덱스입니다.
     */
    private int index;

    /**
     * MyListIterator의 생성자입니다.
     *
     * @param list 순회할 MyList 객체
     */
    public MyListIterator(MyList<T> list) {
        this.list = list;
        this.index = 0;
    }

    /**
     * 다음 요소가 존재하는지 확인합니다.
     *
     * @return 다음 요소가 있으면 true, 없으면 false
     */
    @Override
    public boolean hasNext() {
        // 현재 인덱스가 리스트 크기보다 작으면 다음 요소가 있음
        return index < list.size();
    }

    /**
     * 다음 요소를 반환합니다.
     *
     * @return 다음 요소
     */
    @Override
    public T next() {
        // 다음 요소가 없으면 예외 발생
        if (!hasNext()) {
            throw new IndexOutOfBoundsException("더 이상 요소가 없습니다.");
        }
        // 현재 인덱스의 요소를 반환하고 인덱스를 증가시킴
        return list.get(index++);
    }
}
