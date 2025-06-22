package structural_patterns.flyweight.ex02;

import java.util.HashMap;

// FontFactory 클래스는 글꼴 객체를 관리하는 FlyweightFactory 역할을 합니다.
// 동일한 속성의 글꼴은 한 번만 생성해서 여러 번 재사용합니다.
public class FontFactory {
    // 글꼴 속성(이름+크기+색상)을 키로 하여 Font 객체를 저장하는 Map입니다.
    private static final HashMap<String, Font> fontMap = new HashMap<>();

    // 글꼴 속성에 맞는 Font 객체를 반환합니다.
    // 이미 존재하면 기존 객체를, 없으면 새로 생성해서 반환합니다.
    public static Font getFont(String font, int size, String color) {
        // 속성 조합으로 키를 만듭니다.
        String key = font + size + color;
        // 키로 Font 객체를 찾습니다.
        Font fontObject = fontMap.get(key);

        if (fontObject == null) {
            // 없으면 새로 생성해서 Map에 저장합니다.
            fontObject = new ConcreteFont(font, size, color);
            fontMap.put(key, fontObject);
            System.out.println("Creating font: " + key);
        } else {
            // 이미 있으면 재사용합니다.
            System.out.println("Reusing font: " + key);
        }
        // Font 객체를 반환합니다.
        return fontObject;
    }
}
