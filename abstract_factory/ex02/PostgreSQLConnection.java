package abstract_factory.ex02;

/**
 * PostgreSQL 데이터베이스 연결을 구현한 클래스
 */
public class PostgreSQLConnection implements Connection {
    /**
     * PostgreSQL 데이터베이스 연결을 시작
     */
    @Override
    public void open() {
        System.out.println("Opening PostgreSQL connection");
    }

    /**
     * PostgreSQL 데이터베이스 연결을 종료
     */
    @Override
    public void close() {
        System.out.println("Closing PostgreSQL connection");
    }
}
