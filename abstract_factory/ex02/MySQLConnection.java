package abstract_factory.ex02;

/**
 * MySQL 데이터베이스 연결을 구현한 클래스
 */
public class MySQLConnection implements Connection {
    /**
     * MySQL 데이터베이스 연결을 시작
     */
    @Override
    public void open() {
        System.out.println("Opening MySQL connection");
    }

    /**
     * MySQL 데이터베이스 연결을 종료
     */
    @Override
    public void close() {
        System.out.println("Closing MySQL connection");
    }
}
