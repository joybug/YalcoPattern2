package abstract_factory.ex02;

/**
 * 데이터베이스 연결을 정의하는 인터페이스
 */
public interface Connection {
    /**
     * 데이터베이스 연결을 시작
     */
    void open();
    
    /**
     * 데이터베이스 연결을 종료
     */
    void close();
}
