package abstract_factory.ex02;

/**
 * 데이터베이스 관련 객체들을 생성하는 추상 팩토리 인터페이스
 * 추상 팩토리 패턴의 핵심 인터페이스로, 관련된 객체들의 생성을 담당
 */
public interface DatabaseFactory {
    /**
     * 데이터베이스 연결 객체를 생성
     * @return 구체적인 데이터베이스 Connection 구현체
     */
    Connection createConnection();
    
    /**
     * 데이터베이스 명령 객체를 생성
     * @return 구체적인 데이터베이스 Command 구현체
     */
    Command createCommand();
    
    /**
     * 데이터베이스 결과집합 객체를 생성
     * @return 구체적인 데이터베이스 ResultSet 구현체
     */
    ResultSet createResultSet();
}
