package solid_principles.liskov_substitution.ex02.compliant;

/**
 * 도형의 기본 동작을 정의하는 인터페이스
 * 모든 도형은 면적 계산 기능을 가짐
 */
interface Shape {
    /**
     * 도형의 면적을 계산하는 메소드
     * @return 계산된 면적 값
     */
    int getArea();
}

