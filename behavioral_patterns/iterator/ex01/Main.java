package behavioral_patterns.iterator.ex01;

/**
 * Iterator 패턴 예제의 메인 클래스입니다.
 * MyList와 MyListIterator를 사용하여 리스트를 순회하는 예시를 보여줍니다.
 */
public class Main {
    /**
     * 프로그램의 시작점입니다.
     * @param args 커맨드라인 인자(사용하지 않음)
     */
    public static void main(String[] args) {
        // MyList 객체 생성
        MyList<String> list = new MyList<>();
        // 리스트에 요소 추가
        list.add("사과");
        list.add("바나나");
        list.add("체리");

        // Iterator를 사용하여 리스트 순회
        MyIterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item); // 각 요소를 출력
        }
    }
}
