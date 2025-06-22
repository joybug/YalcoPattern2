package solid_principles.liskov_substitution.ex02.noncompliant;

/**
 * 정사각형을 나타내는 Rectangle의 하위 클래스
 * LSP를 위반하는 예시: 정사각형은 가로/세로가 항상 같아야 함
 */
class Square extends Rectangle {
    /**
     * 정사각형의 가로 길이를 설정하는 메서드
     * LSP 위반: 가로 길이 변경 시 세로 길이도 같이 변경됨
     * @param width 설정할 가로 길이
     */
    @Override
    public void setWidth(int width) {
        // 정사각형은 가로와 세로가 같아야 하므로 둘 다 같은 값으로 설정
        this.width = width;
        this.height = width;
    }

    /**
     * 정사각형의 세로 길이를 설정하는 메서드
     * LSP 위반: 세로 길이 변경 시 가로 길이도 같이 변경됨
     * @param height 설정할 세로 길이
     */
    @Override
    public void setHeight(int height) {
        // 정사각형은 가로와 세로가 같아야 하므로 둘 다 같은 값으로 설정
        this.width = height;
        this.height = height;
    }
}