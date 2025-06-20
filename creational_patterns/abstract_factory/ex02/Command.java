package abstract_factory.ex02;

/**
 * 데이터베이스 쿼리 실행을 정의하는 인터페이스
 */
public interface Command {
    /**
     * SQL 쿼리를 실행
     * @param query 실행할 SQL 쿼리문
     */
    void execute(String query);
}
