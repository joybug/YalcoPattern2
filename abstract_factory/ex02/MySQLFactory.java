package abstract_factory.ex02;

/**
 * MySQL 데이터베이스 관련 객체들을 생성하는 구체적인 팩토리 클래스
 */
public class MySQLFactory implements DatabaseFactory {
    /**
     * MySQL 데이터베이스 연결 객체를 생성
     * @return MySQL Connection 구현체
     */
    @Override
    public Connection createConnection() {
        return new MySQLConnection();
    }

    /**
     * MySQL 데이터베이스 명령 객체를 생성
     * @return MySQL Command 구현체
     */
    @Override
    public Command createCommand() {
        return new MySQLCommand();
    }

    /**
     * MySQL 데이터베이스 결과집합 객체를 생성
     * @return MySQL ResultSet 구현체
     */
    @Override
    public ResultSet createResultSet() {
        return new MySQLResultSet();
    }
}
