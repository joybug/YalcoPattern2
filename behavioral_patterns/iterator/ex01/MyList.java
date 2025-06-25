package behavioral_patterns.iterator.ex01;

/**
 * MyList 클래스는 Object 배열을 이용한 구체적인 컬렉션입니다.
 * Collection 인터페이스를 구현합니다.
 */
class MyList implements Collection {
    private Object[] items;
    private int last = 0;

    public MyList(int size) {
        items = new Object[size];
    }

    /**
     * 컬렉션에 요소를 추가합니다.
     */
    public void add(Object item) {
        if (last < items.length) {
            items[last] = item;
            last++;
        }
    }

    /**
     * 지정한 인덱스의 요소를 반환합니다.
     */
    public Object get(int index) {
        return items[index];
    }

    /**
     * 현재 저장된 요소의 개수를 반환합니다.
     */
    public int size() {
        return last;
    }

    @Override
    public MyIterator createIterator() {
        return new MyListIterator(this);
    }
}
