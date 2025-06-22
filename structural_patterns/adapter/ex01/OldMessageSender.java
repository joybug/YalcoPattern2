package structural_patterns.adapter.ex01;

// OldMessageSender 인터페이스는 예전 메시지 전송 시스템의 표준 인터페이스입니다.
// send()는 메시지 데이터 배열을 받아 메시지를 전송합니다.
public interface OldMessageSender {
    // 메시지 데이터 배열을 받아 메시지를 전송하는 메소드입니다.
    // 성공 시 1을 반환합니다.
    int send(String[] messageData);
}