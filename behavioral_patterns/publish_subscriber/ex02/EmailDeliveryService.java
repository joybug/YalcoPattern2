package behavioral_patterns.publish_subscriber.ex02;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * EmailDeliveryService 클래스는 Broker 역할로,
 * 이벤트별 구독자 관리 및 비동기 이메일 발송을 담당합니다.
 */
class EmailDeliveryService {
    private Map<String, List<Customer>> customerGroups = new HashMap<>();
    private ExecutorService executor = Executors.newCachedThreadPool();

    public void subscribe(String eventType, Customer customer) {
        customerGroups.computeIfAbsent(eventType, k -> new ArrayList<>()).add(customer);
    }

    public void sendEmails(String eventType, String message) {
        List<Customer> customers = customerGroups.get(eventType);
        if (customers != null) {
            for (Customer customer : customers) {
                executor.submit(() -> customer.receiveEmail(message));
            }
        }
    }
    public void shutdown() { executor.shutdown(); }
}
