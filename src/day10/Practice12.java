package day10;

public class Practice12{
    public static void main(String[] args) {
        // [1] 상속받은 클래스는 상위클래스의 멤버변수/메소드 물려받는다.
        Student s1 = new Student();
        s1.name = "유재석"; s1.studentId = 10;
        // [2]
        Cat cat = new Cat();
        cat.makeSound();
        // [3] Coputer가 만들어지기 전에 Machine 객체 생성, 이유 : super()
        Computer computer = new Computer();
        // [4]
        Figure figure = new Triangle(); // Triangle(하위) --> figure(상위)
        // [5]
        Shape shape = new Circle();
        shape.draw();
        // [6]
        Vehicle vehicle = new Bus();
        if( vehicle instanceof Bus ){
            Bus bus = (Bus)vehicle;
            bus.checkFare();
        }
        // [7]
        Beverage[] beverages = {
            new Coke(),
            new Coffee()
        };
        for( Beverage beverage : beverages ){
            beverage.drink();
        }
        // [8]
        Sword sword = new Sword();
        Gun gun = new Gun();
        Character myChr = new Character();
        myChr.use( gun );   // 총으로 공격합니다
        myChr.use( sword );   // 검으로 공격합니다
        // [9]
        SuperClass obj = new SubClass();
        System.out.println( obj.name );
        obj.method();
        // 필드는 변수의 타입(SuperClass)을 기준으로 접근하므로 "상위" 출력
        // 메소드는 실제 생성된 객체(SubClass)의 오버라이딩 메소드가 실행되므로 "하위 메소드" 출력
        // [10]
        Laptop laptop = new Laptop();
        System.out.println( laptop instanceof Electronic );
        System.out.println( laptop instanceof Device );
    } // m end
} // c end
// [1]
class Person{ String name; }
class Student extends Person{ int studentId; }

// [2]  Overriding, 자동완성: { } 안에서 ctrl+스페이스바 / 오른쪽클릭 -> 소스작업
class Animal{ void makeSound(){System.out.println("동물이 소리를");}}
class Cat extends Animal{ 
    @Override
    void makeSound() { System.out.println("고양이가 야옹하고 웁니다.");}
 }
// [3] 자식생성자가 실행될때 부모 생성자가 먼저 실행된다. * 생성자내부에는 super()
class Machine{ Machine(){System.out.println("부모 클래스 생성자 실행");}}
class Computer extends Machine{ Computer(){System.out.println("자식 클래스 생성자 실행");}}

// [4]
class Figure{ }
class Triangle extends Figure{ }

// [5] 주의할점: 메소드 오버라이딩 할 경우 메소드 위에 @Override 생략시 자동 할당
class Shape{ void draw() { }}
class Circle extends Shape{ void draw(){ System.out.println("원을 그립니다.");}}
// [6]
class Vehicle{ }
class Bus extends Vehicle{
    void checkFare(){System.out.println("요금을 확인합니다.");}}
// [7]
class Beverage{
    void drink(){System.out.println("음료를 마십니다.");}}
class Coke extends Beverage{
    @Override
    void drink(){System.out.println("콜라를 마십니다.");}}
class Coffee extends Beverage{
    @Override
    void drink(){System.out.println("커피를 마십니다.");}}
// [8]
class Character{
    void use(Weapon weapon){weapon.attack();}}
class Weapon{ void attack(){System.out.println("무기로 공격합니다.");} }
class Sword extends Weapon{ void attack(){System.out.println("검으로 공격합니다.");} }
class Gun extends Weapon{ void attack(){System.out.println("총으로 공격합니다.");} }
// [9]
class SuperClass{
    String name = "상위";
    void method(){System.out.println("상위 메소드");}}
class SubClass extends SuperClass{
    String name = "하위";
    @Override
    void method(){System.out.println("하위 메소드");}}
// [10]
class Device{ }
class Electronic extends Device{ }
class Laptop extends Electronic{ }
