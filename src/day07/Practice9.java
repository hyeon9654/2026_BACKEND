package day07;

public class Practice9 {
    public static void main(String[] args) {
        
        // [1]
        Printer printer = new Printer();    printer.printMessage();
        // [2]
        Greeter greeter = new Greeter();      greeter.greet("현민");
        // [3]
        SimpleCalculator s1 = new SimpleCalculator();
        int result = s1.add( 10, 5);
        System.out.println( result );
        // [4]
        Checker c1 = new Checker();
        boolean result2 = c1.isEven(10);
        if(result2){
            System.out.println("짝수입니다.");
        }else{
            System.out.println("홀수입니다.");
        }                                                     
        // [5]
        Lamp l1 = new Lamp();
        l1.turnOn();
        System.out.println(l1.isOn);
        l1.turnOff();
        System.out.println(l1.isOn);
        // [6]
        Product p = new Product();
        p.name = "콜라";
        p.stock = 10;

        boolean result3 = p.sell(11);
        System.out.println(result3);   
        System.out.println(p.stock); 
        // [7]
        Visualizer visualizer = new Visualizer();
        String results = visualizer.getStars(5);
        System.out.println(results);

    } // main end
} // class end
// [1]
class Printer{
    void printMessage(){
    System.out.println("안녕하세요, 메소드입니다.");
    }
}
// [2]
class Greeter{
    void greet(String name){
        System.out.printf("안녕하세요,%s님\n", name);
    }
}
// [3] 
class SimpleCalculator{
    int add( int x, int y){
        return x + y;
    }
}
// [4]
class Checker {
     boolean isEven(int num){
        if(num % 2 == 0){
            return true;
        }
        return false;
    }
}
// [5]
class Lamp{
    boolean isOn;

    void turnOn(){
        isOn = true;
    }

    void turnOff(){
        isOn = false;
    }
}
// [6]
class Product{
    String name;
    int stock;

    boolean sell(int qty) {
        if (stock >= qty){
            stock -= qty;
            return true;
        } else {
            System.out.println("재고 부족");
            return false;
        }
    }
}
// [7]
class Visualizer {
    String getStars(int count) {
        String stars = "";
        for (int i = 1; i <= count; i++) {
            stars += "★";
        }
        return stars;
    }
}
/*[문제 7] Visualizer 클래스를 만드세요.
1. 정수 하나를 매개변수로 받아, 그 숫자만큼 "★" 문자를 반복하여 하나의 문자열로 만들어 반환하는 getStars 메소드를 정의하세요.
2. main 함수에서 getStars(5)를 호출하여 반환된 문자열 "★★★★★"를 출력하세요.*/


/*[문제 8] ParkingLot 클래스를 만드세요.
1. 주차 시간(분)을 매개변수로 받아, 요금 규정에 따라 계산된 최종 주차 요금을 반환하는 calculateFee 메소드를 정의하세요.
2. 요금 규정:
기본 요금: 최초 30분까지 1,000원
추가 요금: 30분 초과 시, 매 10분마다 500원씩 추가
일일 최대 요금: 20,000원
3. main 함수에서 calculateFee 메소드에 65, 140을 각각 인자로 전달하여 반환된 요금을 출력하세요.*/
