package structural_patterns.composite.ex02;

import java.util.ArrayList;
import java.util.List;

// Window 클래스는 최상위 UI 컨테이너(윈도우)를 나타냅니다.
public class Window implements UIComponent {
    // 윈도우의 제목과 하위 컴포넌트 리스트를 저장합니다.
    private String title;
    private List<UIComponent> components = new ArrayList<>();

    // 생성자: 윈도우 제목을 받아 Window 객체를 생성합니다.
    public Window(String title) {
        this.title = title;
    }

    // 윈도우를 화면에 그리는 메소드입니다.
    @Override
    public void render() {
        System.out.println("Window: " + title);
        // 하위 컴포넌트들도 모두 그립니다.
        components.forEach(UIComponent::render);
    }

    // 하위 컴포넌트를 추가하는 메소드입니다.
    @Override
    public void add(UIComponent component) {
        components.add(component);
    }

    // 하위 컴포넌트를 제거하는 메소드입니다.
    @Override
    public void remove(UIComponent component) {
        components.remove(component);
    }
}
