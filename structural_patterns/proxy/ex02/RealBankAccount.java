package structural_patterns.proxy.ex02;

// RealBankAccount 클래스는 실제 은행 계좌를 나타냅니다.
// BankAccount 인터페이스를 구현하며, 실제로 잔액을 관리합니다.
public class RealBankAccount implements BankAccount {
    // 계좌의 현재 잔액을 저장하는 변수입니다.
    private double balance;
    
    // 생성자: 초기 잔액을 받아서 계좌를 생성합니다.
    public RealBankAccount(double initialBalance) {
        // 전달받은 초기 잔액을 balance에 저장합니다.
        this.balance = initialBalance;
    }

    // BankAccount 인터페이스의 withdraw 메소드 구현
    // 계좌에서 금액을 인출합니다.
    @Override
    public void withdraw(double amount) {
        // 잔액이 충분한지 확인합니다.
        if (balance >= amount) {
            // 잔액에서 인출 금액을 뺍니다.
            balance -= amount;
            // 인출 결과를 출력합니다.
            System.out.println(
                amount + " withdrawn. Current balance: " + balance);
        } else {
            // 잔액이 부족할 때 메시지를 출력합니다.
            System.out.println("Insufficient balance.");
        }
    }

    // BankAccount 인터페이스의 deposit 메소드 구현
    // 계좌에 금액을 입금합니다.
    @Override
    public void deposit(double amount) {
        // 잔액에 입금 금액을 더합니다.
        balance += amount;
        // 입금 결과를 출력합니다.
        System.out.println(
            amount + " deposited. Current balance: " + balance);
    }
}
