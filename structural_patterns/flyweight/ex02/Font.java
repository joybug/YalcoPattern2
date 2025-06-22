package structural_patterns.flyweight.ex02;

// Font 인터페이스는 글꼴 객체가 가져야 할 기능을 정의합니다.
// apply() 메소드는 지정한 텍스트에 글꼴을 적용합니다.
public interface Font {
    // 텍스트에 글꼴을 적용하는 메소드입니다.
    void apply(String text);
}
