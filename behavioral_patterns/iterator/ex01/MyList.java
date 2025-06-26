package behavioral_patterns.iterator.ex01;

/**
 * ArrayList와 유사한 리스트 컬렉션 클래스입니다.
 * @param <T> 리스트의 요소 타입
 */
public class MyList<T> implements Collection<T> {
    /**
     * 내부적으로 요소를 저장하는 배열입니다.
     */
    private Object[] items;
    /**
     * 현재 저장된 요소의 개수입니다.
     */
    private int size;
    /**
     * 배열의 초기 용량입니다.
     */
    private static final int INITIAL_CAPACITY = 10;

    /**
     * MyList의 생성자입니다. 내부 배열을 초기화합니다.
     */
    public MyList() {
        // 배열을 초기 용량으로 생성
        items = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    /**
     * 요소를 리스트에 추가합니다.
     * @param item 추가할 요소
     */
    @Override
    public void add(T item) {
        // 배열이 가득 찼으면 크기를 2배로 늘림
        if (size == items.length) {
            Object[] newItems = new Object[items.length * 2];
            System.arraycopy(items, 0, newItems, 0, items.length);
            items = newItems;
        }
        items[size++] = item;
    }

    /**
     * 리스트의 요소 개수를 반환합니다.
     * @return 요소 개수
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * 리스트를 순회할 수 있는 Iterator를 반환합니다.
     * @return MyListIterator 객체
     * (경고) 제네릭 타입의 한계로 인해 타입 안전성 경고가 발생할 수 있습니다.
     * 실제로는 MyListIterator가 MyIterator<T>를 구현하므로 사용에는 문제가 없습니다.
     */
    @Override
    public MyIterator<T> iterator() {
        // MyListIterator는 제네릭이 아니므로 <>를 제거
        return new MyListIterator(this); // 타입 안전성 경고 무시
    }

    /**
     * 인덱스에 해당하는 요소를 반환합니다.
     * @param index 가져올 요소의 인덱스
     * @return 해당 인덱스의 요소
     * @throws IndexOutOfBoundsException 인덱스가 범위를 벗어나면 예외 발생
     * (경고) 제네릭 배열을 직접 만들 수 없으므로 Object 배열을 사용하고,
     * 반환 시 타입 캐스팅을 하게 됩니다. 이로 인해 타입 안전성 경고가 발생할 수 있습니다.
     * 사용 시 주의가 필요합니다.
     */
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("인덱스가 범위를 벗어났습니다.");
        }
        return (T) items[index]; // 타입 안전성 경고 무시
    }
}
