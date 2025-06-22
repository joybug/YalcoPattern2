package structural_patterns.composite.ex02;

import java.util.ArrayList;
import java.util.List;

// Panel 클래스는 여러 UI 컴포넌트를 담을 수 있는 컨테이너 역할을 합니다.
public class Panel implements UIComponent {
    // 패널의 이름과 하위 컴포넌트 리스트를 저장합니다.
    private String name;
    private List<UIComponent> components = new ArrayList<>();

    // 생성자: 패널 이름을 받아 Panel 객체를 생성합니다.
    public Panel(String name) {
        this.name = name;
    }

    // 패널을 화면에 그리는 메소드입니다.
    @Override
    public void render() {
        System.out.println("Panel: " + name);
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
