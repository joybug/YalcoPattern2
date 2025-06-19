package prototype.ex01;

/**
 * 사람의 정보를 관리하는 클래스입니다.
 * Prototype 인터페이스를 구현하여 객체의 복제가 가능합니다.
 */
public class Person implements Prototype {
    // 사람의 기본 정보를 저장하는 필드들
    private String name;    // 이름
    private int age;       // 나이
    private String address; // 주소

    /**
     * 새로운 Person 객체를 생성하는 생성자입니다.
     * @param name 사람의 이름
     * @param age 사람의 나이
     * @param address 사람의 주소
     */
    public Person(String name, int age, String address) {
        // 각 필드를 매개변수로 받은 값으로 초기화
        this.name = name;      // 이름 설정
        this.age = age;        // 나이 설정
        this.address = address; // 주소 설정
    }

    /**
     * 기존 Person 객체를 복사하여 새로운 객체를 생성하는 복사 생성자입니다.
     * @param other 복사할 원본 Person 객체
     */
    public Person(Person other) {
        // 다른 Person 객체의 모든 필드값을 복사
        this.name = other.name;       // 이름 복사
        this.age = other.age;         // 나이 복사
        this.address = other.address; // 주소 복사
    }

    /**
     * Prototype 인터페이스의 clone 메서드를 구현합니다.
     * @return 현재 객체의 깊은 복사본
     */
    @Override
    public Person clone() {
        // 복사 생성자를 사용하여 새로운 객체 생성 및 반환
        return new Person(this);
    }

    /**
     * Person 객체의 주소를 변경하는 메소드입니다.
     * @param newAddress 설정할 새로운 주소
     */
    public void setAddress(String newAddress) {
        // 새로운 주소로 업데이트
        this.address = newAddress;
    }

    /**
     * Person 객체의 모든 정보를 콘솔에 출력하는 메소드입니다.
     */
    public void displayInfo() {
        // 이름, 나이, 주소를 포함한 정보를 형식화하여 출력
        System.out.println(
            "Name: " + name + ", Age: " + age
             + ", Address: " + address);
    }
}
