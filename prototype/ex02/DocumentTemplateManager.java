package prototype.ex02;

import java.util.HashMap;
import java.util.Map;

/**
 * 문서 템플릿을 관리하는 매니저 클래스입니다.
 * 싱글톤 패턴과 프로토타입 패턴을 함께 사용합니다.
 */
public class DocumentTemplateManager {
    // 템플릿 문서들을 저장하는 Map
    private static final Map<String, Document> templates = new HashMap<>();

    /**
     * 새로운 템플릿을 추가하는 메소드입니다.
     * @param name 템플릿의 식별자 이름
     * @param doc 템플릿으로 사용할 Document 객체
     */
    public static void addTemplate(String name, Document doc) {
        // Map에 템플릿 추가
        templates.put(name, doc);
    }

    /**
     * 저장된 템플릿의 복제본을 생성하여 반환합니다.
     * @param templateName 복제할 템플릿의 이름
     * @return 템플릿의 복제본
     * @throws IllegalArgumentException 템플릿을 찾을 수 없을 때 발생
     */
    public static Document createDocument(String templateName) {
        // Map에서 템플릿 검색
        Document template = templates.get(templateName);
        // 템플릿이 없으면 예외 발생
        if (template == null) {
            throw new IllegalArgumentException(
                "Template not found: " + templateName);
        }
        // 템플릿의 복제본 반환
        return (Document) template.clone();
    }
}
