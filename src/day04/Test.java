package day04;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // [1] 배열
        int[] array = new int[0];   // 0개 저장 가능한 배열

        // [2] 배열내 꼬리(마지막인덱스)에 요소 추가, array.length - 1
        array[ array.length - 1 ] = 30; //Index - 1 out of bounds for lengths 0 // 즉 인덱스 없다.

        // [3] 현재 배열내 +1 증가한 새로운 배열 만들기
        int[] newArray = new int[ array.length - 1 ];

        // [*]
        for( int index = 0; index <= array.length - 1; index++){
            newArray[index] = array[index]; // 오른쪽 기준배열 index 값을 왼쪽 새로운 배열 index에 대입
        }

        // [4] [2] 반복
        newArray[ array.length - 1 ] = 30;

        // [5] 기존배열변수에 새로운 배열 대입
        array = newArray;
        // [*]
        System.out.println( Arrays.toString( array ));
    } // m end
} // c end
/*
[배열 재할당 문제]

목적:
기본 배열에서 배열 재할당 원리를 이해하고,
요소의 추가 및 특정 위치 삭제 로직을 직접 구현한다.

제약 조건:
- AI 사용금지, 구글링 사용하기
- main 메서드 내부에서만 코드를 작성할 것.
- ArrayList, Vector 등 컬렉션 프레임워크 클래스 사용 금지
- 별도의 사용자 정의 함수(메서드)를 선언하지 말 것.
- 메뉴 선택 및 데이터 처리는 while 무한 루프와 Scanner를 사용할 것.

실행 예시:

현재 배열 [크기: 0]: 비어 있음
1. 요소 추가 | 2. 인덱스 삭제 | 0. 종료
메뉴를 선택하세요: 1
추가할 정수 값을 입력하세요: 10
>> 10 값이 성공적으로 추가되었습니다.
----------------------------

현재 배열 [크기: 1]: [ 10 ]
1. 요소 추가 | 2. 인덱스 삭제 | 0. 종료
메뉴를 선택하세요: 1
추가할 정수 값을 입력하세요: 25
>> 25 값이 성공적으로 추가되었습니다.
----------------------------

현재 배열 [크기: 2]: [ 10, 25 ]
1. 요소 추가 | 2. 인덱스 삭제 | 0. 종료
메뉴를 선택하세요: 1
추가할 정수 값을 입력하세요: 40
>> 40 값이 성공적으로 추가되었습니다.
----------------------------

현재 배열 [크기: 3]: [ 10, 25, 40 ]
1. 요소 추가 | 2. 인덱스 삭제 | 0. 종료
메뉴를 선택하세요: 2
삭제할 인덱스 번호(0 ~ 2)를 입력하세요: 1
>> 인덱스 [1]의 값 (25)이 삭제되었습니다.
----------------------------

현재 배열 [크기: 2]: [ 10, 40 ]
1. 요소 추가 | 2. 인덱스 삭제 | 0. 종료
메뉴를 선택하세요: 0
프로그램을 종료합니다.
*/