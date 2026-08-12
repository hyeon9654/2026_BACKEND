package day11;

public class Exam3 {
    public static void main(String[] args) {
        // 1.
        Car myCar = new Car();
        // myCar.run(); // [오류] because "this.tire is mull")
    }
}
class Car{
    Tire tire;
    void run( ){ this.tire.roll(); }
}
// 인터페이스
interface Tire{
    void roll(); // { } 없는 메소드는 추상메소드
}

// 구현체
class HankookTire implements Tire{
    // 추상메소트 { } 구현(재정의)
    @Override public void roll() {
        System.out.println("한국타이어 회원");
    }
}
class KumhoTire implements Tire{
    @Override public void roll() {
        System.out.println("금호타이어 회원");
    }
}