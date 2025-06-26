package behavioral_patterns.specification.ex01;

/**
 * Main 클래스는 Specification 패턴의 조건 조합 예제를 실행합니다.
 * 짝수, 범위, 두 조건의 and 조합을 테스트합니다.
 */
public class Main {
    /**
     * 프로그램의 시작점입니다.
     * @param args 커맨드라인 인자(사용하지 않음)
     */
    public static void main(String[] args) {
        // 짝수 조건 객체 생성
        Specification evenSpec = new EvenSpecification();
        // 범위 조건 객체 생성(10~20)
        Specification rangeSpec = new RangeSpecification(10, 20);

        // 두 조건을 and(논리곱)로 결합
        Specification evenAndInRangeSpec = evenSpec.and(rangeSpec);

        int number = 24;

        // 각 조건별 판별 결과 출력
        System.out.println("Even: " + evenSpec.isSatisfiedBy(number));
        System.out.println("In range 10-20: " + rangeSpec.isSatisfiedBy(number));
        System.out.println("Even and in range 10-20: " + evenAndInRangeSpec.isSatisfiedBy(number));
    }
}
