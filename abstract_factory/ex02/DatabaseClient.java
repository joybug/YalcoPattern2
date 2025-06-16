package abstract_factory.ex02;

/**
 * 데이터베이스 작업을 수행하는 클라이언트 클래스
 */
public class DatabaseClient {

    private Connection connection;
    private Command command;
    private ResultSet resultSet;

    /**
     * 데이터베이스 팩토리를 통해 필요한 객체들을 초기화하는 생성자
     * @param factory 사용할 데이터베이스 팩토리
     */
    public DatabaseClient(DatabaseFactory factory) {
        connection = factory.createConnection();
        command = factory.createCommand();
        resultSet = factory.createResultSet();
    }

    /**
     * 데이터베이스 연결, 쿼리 실행, 결과 조회 등의 일련의 작업을 수행
     */
    public void performDatabaseOperations() {
        connection.open();
        command.execute("SELECT * FROM users");
        resultSet.getResults();
        connection.close();
    }
}
