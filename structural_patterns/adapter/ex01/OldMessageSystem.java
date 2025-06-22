package structural_patterns.adapter.ex01;

// OldMessageSystem 클래스는 예전 메시지 전송 시스템의 실제 구현체입니다.
class OldMessageSystem implements OldMessageSender {
    // 메시지 데이터 배열을 받아 메시지를 전송합니다.
    @Override
    public int send(String[] messageData) {
        // 메시지와 수신자를 출력합니다.
        System.out.println(
            "OldMessageSystem: Sending message: " 
            + messageData[0] + " to " + messageData[1]
        );
        // 성공적으로 전송되었음을 나타내는 1을 반환합니다.
        return 1; // Success code
    }
}
