package day09;

import java.util.ArrayList;

public class Exam1 {
    public static void main(String[] args) {

        // 2. 목적 : 
        

        // [1] 리스트 생성
        ArrayList< String > 변수명1 = new ArrayList<>(); // String 타입 여러개 저장하는 리스트
        // [2] 리스트 요소 추가
        변수명1.add("유재석");      변수명1.add("강호동");      변수명1.add("신동엽")
        // [3] 리스트 전체 출력
        System.out.println( 변수명1 );    // [유재석,강호동,신동엽] 
        // [4] 리스트 중간 삽입
        변수명1.add(1,"하하");  // 1번 인덱스(두번째) 자리에 요소 추가
        System.out.println( 변수명1 );  // [유재석,하하,강호동,신동엽] 
        // [5] 리스트 요소 수정
        변수명1.set(1, "서장훈");
        System.out.println( 변수명1 );  // [유재석,서장훈,강호동,신동엽]
        // [6] 리스트 요소 총개수
        System.out.println( 변수명1.size() ); // 4
        // [7] 리스트 특정 요소 출력
        System.out.println( 변수명1. get(1));   // 1번 인덱스(두번째) 요소 값 호출 // 서장훈
        // [8] 리스트 요소 삭제
        변수명1.remove(1);  // 1번 인덱스(두번째) 요소 값 삭제
        System.out.println( 변수명1 );  // [ 유재석,깅호동,신동엽]
        // [9] 리스트 요소 찾기
        System.out.println( 변수명1.indexOf("강호동"));     // '강호동' 찾을 값의 인덱스 반환 없으면 -1
        System.out.println( 변수명1.contains("강호동"));    // '강호동' 찾을 값의 있으면 true 없으면 false
        // [10] 반복문과 리스트 관계
        // 1. 일반 for문
        for( int index = 0 ; index <= 변수명1.size() - 1 ; index++ ){ String str = 변수명1.get(index); }
        // 2. 향상된 for문, ; 콜론 기준 오른쪽 리스트내 요소 하나씩 왼쪽에 (반복)대입
        for( String str : 변수명1 ) { }
        // [11] 리스트 전체 삭제
        변수명1.clear();
        // [12] 리스트 요소 여부 확인
        System.out.println( 변수명1.isEmpty() );    // 리스트내 요소가 하나도 없으면 true

    } // main end
} // class end
