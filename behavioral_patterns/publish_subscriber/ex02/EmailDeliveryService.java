package behavioral_patterns.publish_subscriber.ex02;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * EmailDeliveryService 클래스는 Broker 역할로,
 * 이벤트별 구독자 관리 및 비동기 이메일 발송을 담당합니다.
 */
class EmailDeliveryService {
    /**
     * 이벤트별 구독자 목록을 저장하는 맵입니다.
     */
    private Map<String, List<Customer>> customerGroups = new HashMap<>();
    /**
     * 비동기 작업 처리를 위한 ExecutorService입니다.
     */
    private ExecutorService executor = Executors.newCachedThreadPool();

    /**
     * 구독자를 이벤트에 등록합니다.
     * @param eventType 이벤트 타입
     * @param customer 구독자
     */
    public void subscribe(String eventType, Customer customer) {
        customerGroups.computeIfAbsent(eventType, k -> new ArrayList<>()).add(customer);
    }

    /**
     * 이벤트에 등록된 모든 구독자에게 비동기로 이메일을 발송합니다.
     * @param eventType 이벤트 타입
     * @param message 발송할 메시지
     */
    public void sendEmails(String eventType, String message) {
        List<Customer> customers = customerGroups.get(eventType);
        if (customers != null) {
            for (Customer customer : customers) {
                // 각 구독자에게 비동기로 이메일 발송
                executor.submit(() -> customer.receiveEmail(message));
            }
        }
    }

    /**
     * ExecutorService를 종료합니다.
     */
    public void shutdown() { executor.shutdown(); }
}
