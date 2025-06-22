package structural_patterns.proxy.ex02;

// BankAccount 인터페이스는 은행 계좌에서 인출과 입금 기능을 정의합니다.
// 실제 계좌나 프록시(대리자) 계좌 모두 이 인터페이스를 구현해야 합니다.
public interface BankAccount {
    // 계좌에서 지정한 금액을 인출하는 메소드입니다.
    void withdraw(double amount);
    // 계좌에 지정한 금액을 입금하는 메소드입니다.
    void deposit(double amount);
}
