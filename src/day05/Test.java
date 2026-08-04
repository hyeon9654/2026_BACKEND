package day05;

class Book {  // Book 클래스 생성 
  String title; // Book 객체가 가질 멤버변수
  // 생성자: 객체 생성 시 전달받은 도서 제목(title)으로 멤버변수(필드)를 초기화합니다.
  Book(String title) { this.title = title; } 
}
public class Test{
  public static void main(String[] args) {
    Book b1 = new Book("Java Basics");  // "Book 객체" 1개 생성
    Book b2 = new Book("OOP Concepts"); // "Book 객체" 1개 추가 생성

    Book[] library = new Book[3];   // Book 객체를 담을 수 있는 library라는 3칸짜리 "배열 객체" 생성
    // >> library [ null, null, null ] 대충 이런 상태라는 뜻
    library[0] = b1;  // library 배열객체 0번 칸에 b1 객체를 넣음("Java Basics")
    library[1] = new Book("Data Structure"); // Book 객체 추가 생성("Data Structure") // library 1번 칸에 새로만든 객체를 넣음

    Book b3 = library[1];   // b3는 방금 ibrary[1]에 넣은 "Data Structure"를 가리킴 
    // b3 -> Data Structure 객체이자 library[1]의 객체

    b2 = library[0];  // 앞에 Book이 없으니 새 변수 선언이 아닌 기존변수에 대입이기에 본래 있던 b2의 OOP Concepts->Java Basics가 됌

    Book[] archive = library; //library와 archive는 같은 배열이 됌
    archive[2] = new Book("Algorithm"); // "Book 객체" 1개 추가 생성 // 동시에 archive[2]와 library[2]는 Algorithm 

    library[0] = null; // library[0]의 객체를 비움
    b1 = null; // b1을 지움
// 따라서 총 생성된 인스턴스는 5개에 종료 되기 전에 유효한 인스턴스는 4개이고 1개가 사라졌다.
    // ===== 프로그램 실행 종료 직전 (Final State) =====
    // 제시된 코드에서 총 인스턴스는 몇개 만들어졌고 main함수가 종료 되기 전 유효 한 인스턴스는 몇 개 이고 몇개가 사라졌을까?
  }
}
