package abstract_factory.ex02;

/**
 * 추상 팩토리 패턴을 사용하는 메인 실행 클래스
 * MySQL과 PostgreSQL 데이터베이스를 번갈아가며 사용하는 예제를 실행
 */
public class Main {
    public static void main(String[] args) {
        DatabaseClient mysqlClient = new DatabaseClient(new MySQLFactory());
        mysqlClient.performDatabaseOperations();

        System.out.println("\nSwitching to PostgreSQL...\n");

        DatabaseClient postgresClient = new DatabaseClient(new PostgreSQLFactory());
        postgresClient.performDatabaseOperations();
    }
}
