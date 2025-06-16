package abstract_factory.ex02;

/**
 * 데이터베이스 쿼리 결과를 처리하는 인터페이스
 */
public interface ResultSet {
    /**
     * 쿼리 실행 결과를 조회
     */
    void getResults();
}
