package structural_patterns.proxy.ex02;

// Main 클래스는 BankAccountProxy의 동작을 테스트하는 실행 진입점입니다.
public class Main {
    // 프로그램의 시작점인 main 메소드입니다.
    public static void main(String[] args) {
        // Admin 권한을 가진 사용자 계정 생성
        BankAccount adminAccount = new BankAccountProxy("Admin", 1000);
        // 500원을 입금합니다. (누구나 가능)
        adminAccount.deposit(500);   // Deposit allowed
        // 300원을 인출합니다. (Admin만 가능)
        adminAccount.withdraw(300);  // Withdraw allowed

        // Admin 권한이 없는 사용자 계정 생성
        BankAccount userAccount = new BankAccountProxy("User", 1000);
        // 500원을 입금합니다. (누구나 가능)
        userAccount.deposit(500);    // Deposit allowed
        // 300원을 인출하려고 시도합니다. (거부됨)
        userAccount.withdraw(300);   // Withdraw denied
    }
}
