package builder.ex02;

/**
 * HTTP 요청 빌더 패턴 실행 예제
 * 
 * 두 가지 HTTP 요청 생성을 보여줌:
 * 1. GET 요청: URL 파라미터를 포함한 요청
 * 2. POST 요청: 요청 본문을 포함한 요청
 * 
 * 특징:
 * - 각 요청 타입에 따른 적절한 구성요소 설정
 * - 헤더, 파라미터, 바디 등을 유연하게 추가
 * - 메서드 체이닝을 통한 간결한 코드 작성
 */
public class Main {
  public static void main(String[] args) {
    
        HttpRequest getRequest = new HttpRequest.Builder(
            "GET", "https://example.com/api")
            .addHeader("Authorization", "Bearer token")
            .addParameter("query", "builder-pattern")
            .build();

        HttpRequest postRequest = new HttpRequest.Builder(
            "POST", "https://example.com/api")
            .addHeader("Authorization", "Bearer token")
            .setBody("{ \"name\": \"John\", \"age\": 30 }")
            .build();
        
        System.out.println(getRequest);
        System.out.println(postRequest);
    }
}

