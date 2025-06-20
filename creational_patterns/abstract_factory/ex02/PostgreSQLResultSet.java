package abstract_factory.ex02;

/**
 * PostgreSQL 데이터베이스 쿼리 결과를 처리하는 클래스
 */
public class PostgreSQLResultSet implements ResultSet {
    /**
     * PostgreSQL 데이터베이스의 쿼리 실행 결과를 조회
     */
    @Override
    public void getResults() {
        System.out.println("Getting results from PostgreSQL database.");
    }
}
