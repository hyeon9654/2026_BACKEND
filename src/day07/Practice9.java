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

        // [8]
        ParkingLot parking = new ParkingLot();

        int fee1 = parking.calculateFee(65);
        int fee2 = parking.calculateFee(140);

        System.out.println(fee1);
        System.out.println(fee2);

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
// [8]
class ParkingLot{
    int calculateFee(int minutes){

        int fee = 1000;

        if(minutes > 30){
            int extraMinutes = minutes - 30;
            fee += (extraMinutes / 10) * 500;
        }

        if(fee > 20000){
            fee = 20000;
        }

        return fee;
    }
}
