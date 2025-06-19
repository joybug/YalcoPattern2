package prototype.ex02;

/**
 * 문서 템플릿 시스템의 사용 예제를 보여주는 실행 클래스입니다.
 * 템플릿 생성, 문서 복제, 내용 수정 등의 기능을 시연합니다.
 */
public class Main {
    /**
     * 프로그램의 진입점입니다.
     * 템플릿 문서를 생성하고 복제하여 내용을 수정하는 예제를 실행합니다.
     * @param args 명령행 인자
     */
    public static void main(String[] args) {
        // 1. "welcome" 템플릿 등록: 사용자 이름을 치환할 수 있는 템플릿 문서
        DocumentTemplateManager.addTemplate(
            "welcome",
            new TextDocument("Welcome, {name}!"));

        // 2. "meeting" 템플릿 등록: 날짜와 시간을 치환할 수 있는 회의 안내 템플릿 문서
        DocumentTemplateManager.addTemplate(
            "meeting",
            new TextDocument(
                "Meeting scheduled on {date} at {time}"));

        // 3. "welcome" 템플릿을 복제하여 새로운 문서 생성
        Document welcomeDoc = DocumentTemplateManager
            .createDocument("welcome");
        
        // 4. 복제된 문서의 내용에서 {name} 플레이스홀더를 실제 이름으로 치환
        welcomeDoc.setContent(
            welcomeDoc
            .getContent()
            .replace("{name}", "John Doe"));
        
        // 5. 완성된 환영 문서 내용 출력
        System.out.println(
            "Welcome document: " + welcomeDoc.getContent());

        // 6. "meeting" 템플릿을 복제하여 새로운 회의 문서 생성
        Document meetingDoc = DocumentTemplateManager
            .createDocument("meeting");
        
        // 7. 복제된 회의 문서의 내용에서 {date}와 {time} 플레이스홀더를 실제 값으로 치환
        meetingDoc.setContent(meetingDoc.getContent()
                .replace("{date}", "2024-10-01")
                .replace("{time}", "14:00"));
                
        // 8. 완성된 회의 문서 내용 출력
        System.out.println(
            "Meeting document: " + meetingDoc.getContent());
    }
}
