package day11;

public class Practice13 {
    public static void main(String[] args) {
        // [1]
        Soundable sound = new Cat();        sound.makeSound();
        sound = new Dog();                  sound.makeSound();

        // [2]
        System.out.println(RemoteControl.MAX_VOLUME);
        System.out.println(RemoteControl.MIN_VOLUME);

        // [3]
        Sword sword = new Sword();
        Gun gun = new Gun();
        Character character = new Character();
        character.useWeapon(sword);
        character.useWeapon(gun);

        // [4]
        Duck duck = new Duck();
        duck.fly();
        duck.swim();

        // [5]
        Object object = new Duck();

        if(object instanceof Flyable){
            Flyable flyable = (Flyable)object;
            flyable.fly();
        }

        if(object instanceof Swimmable){
            Swimmable swimmable = (Swimmable)object;
            swimmable.swim();
        }

        // [6]
        DataAccessObject dao;
        dao = new OracleDao();
        dao.save();

        dao = new MySqlDao();
        dao.save();

        // [7]
        Greeting greeting = new Greeting(){
            public void welcome(){
                System.out.println("환영합니다.");
            }
        };
        greeting.welcome();

        // [8]
        Television television = new Television();
        television.turnOn();
        television.turnOff();
        television.setMute(true);

        // [9]
        System.out.println(Calculator.plus(10, 20));
    } // main end
} // class end


/*[문제 1] 기본 인터페이스와 구현 */
// [1] 인터페이스 추상메소드( public abstract 생략가능, { } 구현부가 없는 ) 갖는다.
interface Soundable{
    public abstract void makeSound();
}

class Cat implements Soundable{
    public void makeSound(){
        System.out.println("야옹");
    }
}

class Dog implements Soundable{
    @Override
    public void makeSound(){
        System.out.println("멍멍");
    }
}


/*[문제 2] 인터페이스 상수 */
// [2] 인터페이스 상수( public static final ) 갖는다
interface RemoteControl{
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;
}


/*[문제 3] 다형성을 활용한 매개변수 */
// [3]
interface Attackable{
    void attack();
}

class Sword implements Attackable{
    @Override
    public void attack(){
        System.out.println("공격!");
    }
}

class Gun implements Attackable{
    @Override
    public void attack(){
        System.out.println("공격!");
    }
}

class Character{
    void useWeapon(Attackable weapon){
        weapon.attack();
    }
}


/*[문제 4] 다중 인터페이스 구현 */
// [4]
interface Flyable{
    void fly();
}

interface Swimmable{
    void swim();
}

class Duck implements Flyable, Swimmable{
    @Override
    public void fly(){
        System.out.println("하늘을 납니다.");
    }

    @Override
    public void swim(){
        System.out.println("물에서 헤엄칩니다.");
    }
}

/*[문제 5] instanceof와 인터페이스 */
// [5] 문제 [4]와 동일


/*[문제 6] 인터페이스를 이용한 객체 교체 */
// [6]
interface DataAccessObject{
    void save();
}

class OracleDao implements DataAccessObject{
    @Override
    public void save(){
        System.out.println("Oracle DB에 저장");
    }
}
class MySqlDao implements DataAccessObject{
    @Override
    public void save(){
        System.out.println("MySQL DB에 저장");
    }
}

/*[문제 7] 익명 구현 객체 */
// [7] 익명 구현 객체: 클래스 없이 일회성 구현체 만들기
interface Greeting{
    void welcome();
}

/*[문제 8] 디폴트 메소드 (Default Method) */
// [8]
interface Device{
    void turnOn();
    void turnOff();
    public default void setMute(boolean mute){
        System.out.println("무음 처리합니다.");
    }
}

class Television implements Device{
    @Override
    public void turnOn(){
        System.out.println("TV를 켭니다.");
    }
    @Override
    public void turnOff(){
        System.out.println("TV를 끕니다.");
    }
}

/*[문제 9] 정적 메소드 (Static Method) */
// [9]
interface Calculator{
    static int plus(int x, int y){
        return x + y;
    }
}
