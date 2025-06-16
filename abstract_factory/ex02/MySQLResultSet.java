package abstract_factory.ex02;

/**
 * MySQL 데이터베이스 쿼리 결과를 처리하는 클래스
 */
public class MySQLResultSet implements ResultSet {
    /**
     * MySQL 데이터베이스의 쿼리 실행 결과를 조회
     */
    @Override
    public void getResults() {
        // Implementation for retrieving MySQL results
        System.out.println("Getting results from MySQL database");
    }
}
