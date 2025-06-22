package structural_patterns.proxy.ex02;

// BankAccountProxy 클래스는 실제 계좌에 대한 접근을 제어하는 프록시(대리자) 역할을 합니다.
// 사용자의 역할에 따라 인출 권한을 제한할 수 있습니다.
public class BankAccountProxy implements BankAccount {
    // 실제 은행 계좌 객체를 참조합니다.
    private RealBankAccount realBankAccount;
    // 사용자의 역할(예: Admin, User 등)을 저장합니다.
    private String userRole;
    
    // 생성자: 사용자 역할과 초기 잔액을 받아 프록시 객체를 생성합니다.
    public BankAccountProxy(String userRole, double initialBalance) {
        // 전달받은 역할을 저장합니다.
        this.userRole = userRole;
        // 실제 계좌 객체를 생성합니다.
        this.realBankAccount = new RealBankAccount(initialBalance);
    }

    // 사용자가 Admin 권한을 가지고 있는지 확인하는 메소드입니다.
    private boolean hasAccess() {
        // userRole이 "Admin"(대소문자 구분 없이)인지 확인합니다.
        return "Admin".equalsIgnoreCase(userRole);
    }

    // BankAccount 인터페이스의 withdraw 메소드 구현
    // Admin만 인출할 수 있도록 제한합니다.
    @Override
    public void withdraw(double amount) {
        // Admin 권한이 있으면 실제 계좌에서 인출을 수행합니다.
        if (hasAccess()) {
            realBankAccount.withdraw(amount);
        } else {
            // 권한이 없으면 인출이 거부됩니다.
            System.out.println("Access denied. Only Admin can withdraw.");
        }
    }

    // BankAccount 인터페이스의 deposit 메소드 구현
    // 입금은 누구나 할 수 있습니다.
    @Override
    public void deposit(double amount) {
        // 실제 계좌에 입금을 위임합니다.
        realBankAccount.deposit(amount);
    }
}
