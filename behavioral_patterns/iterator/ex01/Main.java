package behavioral_patterns.iterator.ex01;

/**
 * Main 클래스는 Iterator 패턴을 이용한 컬렉션 순회 예제를 실행합니다.
 */
public class Main {
    public static void main(String[] args) {
        MyList list = new MyList(3);
        list.add("A");
        list.add("B");
        list.add("C");

        MyIterator iterator = list.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
