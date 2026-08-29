package day05;

import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        // 1. 
        // [1] 객체 생성
        // 3. new 생성자명();
        // 3. 타입 변수명 = new 생성자명()
        Book b1 = new Book();
        // [2] 객체 멤버변수 수정
        b1.title = "이것은 자바다."; b1.author = "신용권"; b1.price = 30000;
        Book b2 = new Book();
        b2.title = "자바의 정석."; b2.author = "남궁성"; b2.price = 28000; 
        // [3] 객체 멤버변수 출력
        System.out.printf("%s,%s,%d \n", b1.title, b1.author, b1.price);
        System.out.printf("%s,%s,%d \n", b2.title, b2.author, b2.price);

        // 2. 
        Pet p1 = new Pet();
        p1.name = "초코"; p1.species = "푸들"; p1.age = 3;
        Pet p2 = new Pet();
        p2.name = "나비"; p2.species = "코리안숏헤어"; p2.age = 5; 
        System.out.printf("%s,%s,%d \n", p1.name, p1.species, p1.age);
        System.out.printf("%s,%s,%d \n", p2.name, p2.species, p2.age);

        // 3.
        // * 정수:0*, 실수:0.0, 논리 : false, 객체:null
        Rectangle r1 = new Rectangle();
        System.out.println(r1.width);   // 0이 들어있는 이유는 기본값 할당
        r1.width = 10; 
        r1.height = 5;
        System.out.println(r1.width * r1.height);

        // 4.
        BankAccount a1 = new BankAccount();
        a1.accountNumber = "111-222-3333"; a1.ownerName = "유재석"; a1.balance = 10000;
        a1.balance += 5000; System.out.println( "입금 후 잔액:" + a1.balance );
        a1.balance -= 3000; System.out.println( "출금 후 잔액:" + a1.balance );
        
        // 5.
        Product pro1 = new Product();
        pro1.name = "새우깡";    pro1.price = 1500; 
        Product pro2 = new Product();
        pro2.name = "콜라";    pro2.price = 2000; 
        if( pro1.price > pro2.price ){ System.out.println( pro1.name );}
        else{ System.out.println( pro2.name );}

        // 6. 
        Member m1 = new Member();                   // 인스턴스 생성
        m1.id = "admin";    m1.isLogin = false;     // 0
        System.out.println( m1.isLogin );
        m1.isLogin = true;
        System.out.println( m1.isLogin );

        // 7.
        Television t1 = new Television();
        t1.channel = 11;    t1.volume -=2;
        System.out.println( "채널"+ t1.channel ); System.out.println( "볼륨" + t1.volume );

        // 8.
        Player player1 = new Player();
        player1.name = "손흥민"; player1.power = 90; player1.speed = 95;

        Player player2 = new Player();
        player2.name = "이강인"; player2.power = 85; player2.speed = 92;

        int player1Total = player1.power + player1.speed;
        int player2Total = player2.power + player2.speed;

        if( player1Total > player2Total ){
            System.out.println( player1.name );
        }else{
            System.out.println( player2.name );
        }

        // 9.
        MenuItem menu1 = new MenuItem();
        menu1.name = "김치찌개"; menu1.price = 8000; menu1.isSignature = true;

        MenuItem menu2 = new MenuItem();
        menu2.name = "된장찌개"; menu2.price = 8000; menu2.isSignature = false;

        MenuItem menu3 = new MenuItem();
        menu3.name = "계란찜"; menu3.price = 3000; menu3.isSignature = false;

        if( menu1.isSignature == true ){
            System.out.println( "[대표메뉴] " + menu1.name + " : " + menu1.price + "원" );
        }
        if( menu2.isSignature == true ){
            System.out.println( "[대표메뉴] " + menu2.name + " : " + menu2.price + "원" );
        }
        if( menu3.isSignature == true ){
            System.out.println( "[대표메뉴] " + menu3.name + " : " + menu3.price + "원" );
        }

        // 10.
        Scanner scan = new Scanner( System.in );

        UserProfile user1 = new UserProfile();

        System.out.print("이름: ");
        user1.name = scan.next();

        System.out.print("나이: ");
        user1.age = scan.nextInt();

        System.out.print("MBTI: ");
        user1.mbti = scan.next();

        System.out.println("--- 프로필 ---");
        System.out.println("이름: " + user1.name);
        System.out.println("나이: " + user1.age);
        System.out.println("MBTI: " + user1.mbti);

    } //m end
} // c end
// [1] 객체 정의
// 1. 클래스선언 : 기존 class{ } 밖에 새로운 클래스 선언
// 2. 멤버변수선언 : { } 안에 멤버변수 선언
class Book{
    String title;
    String author;
    int price;
}
class Pet{
    String name;
    String species;
    int age;
}
class Rectangle{
    int width;
    int height;
}
class BankAccount{
    String accountNumber;
    String ownerName;
    int balance;
}
class Product{
    String name;
    int price;
}
class Member{
    String id;
    boolean isLogin;
}
class Television{
    int channel = 7;
    int volume = 20;
}
class Player{
    String name;
    int power;
    int speed;
}

class MenuItem{
    String name;
    int price;
    boolean isSignature;
}

class UserProfile{
    String name;
    int age;
    String mbti;
}
