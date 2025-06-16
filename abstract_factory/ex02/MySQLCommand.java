package abstract_factory.ex02;

/**
 * MySQL 데이터베이스 명령을 실행하는 클래스
 */
public class MySQLCommand implements Command {
    /**
     * MySQL 데이터베이스에서 SQL 쿼리를 실행
     * @param query 실행할 SQL 쿼리문
     */
    @Override
    public void execute(String query) {
        // Implementation for executing a MySQL command
        System.out.println("Executing MySQL query: " + query);
    }
}
