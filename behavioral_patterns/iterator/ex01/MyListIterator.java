package behavioral_patterns.iterator.ex01;

/**
 * MyListIterator 클래스는 MyList 컬렉션을 순회하는 구체적인 Iterator입니다.
 */
class MyListIterator implements MyIterator {
    private MyList list;
    private int index;

    public MyListIterator(MyList list) {
        this.list = list;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return list.get(index++);
        }
        return null;
    }
}
