package day19;

import java.util.Scanner;

public class Practice4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        // 1.
        System.out.print("첫 번째 점수: ");
        int 점수1 = scan.nextInt();

        System.out.print("두 번째 점수: ");
        int 점수2 = scan.nextInt();

        int 총점1 = 점수1 + 점수2;

        if (총점1 >= 90) {
            System.out.println("성공");
        } else {
            System.out.println("실패");
        }


        // 2.
        System.out.print("첫 번째 정수: ");
        int 정수1 = scan.nextInt();

        System.out.print("두 번째 정수: ");
        int 정수2 = scan.nextInt();

        if (정수1 > 정수2) {
            System.out.println("더 큰 수: " + 정수1);
        } else {
            System.out.println("더 큰 수: " + 정수2);
        }


        // 3.
        System.out.print("아이디: ");
        String id = scan.next();

        System.out.print("비밀번호: ");
        String pw = scan.next();

        if (id.equals("admin") && pw.equals("1234")) {
            System.out.println("로그인 성공");
        } else {
            System.out.println("로그인 실패");
        }


        // 4.
        System.out.print("비밀번호를 입력하세요: ");
        String password = scan.next();

        int 비밀번호길이 = password.length();

        if (비밀번호길이 < 8) {
            System.out.println("보안 등급: 약함 (8자 이상으로 설정해주세요.)");

        } else if (비밀번호길이 < 12) {
            System.out.println("보안 등급: 보통");

        } else {
            System.out.println("보안 등급: 강함");
        }


        // 5.
        System.out.print("주민등록번호(-포함)를 입력하세요: ");
        String 주민번호 = scan.next();

        char 성별번호 = 주민번호.charAt(7);

        if (성별번호 == '1' || 성별번호 == '3') {
            System.out.println("남자");

        } else if (성별번호 == '2' || 성별번호 == '4') {
            System.out.println("여자");

        } else {
            System.out.println("잘못된 주민등록번호입니다.");
        }


        // 6.
        System.out.print("점수를 입력하세요: ");
        int 게임점수 = scan.nextInt();

        if (게임점수 >= 900) {
            System.out.println("A급 경품");

        } else if (게임점수 >= 700) {
            System.out.println("B급 경품");

        } else if (게임점수 >= 500) {
            System.out.println("C급 경품");

        } else {
            System.out.println("참가상");
        }


        // 7.
        System.out.print("역할을 입력하세요: ");
        String role = scan.next();

        if (role.equals("admin")) {
            System.out.println("모든 기능에 접근할 수 있습니다.");

        } else if (role.equals("editor")) {
            System.out.println("콘텐츠 수정 및 생성 기능에 접근할 수 있습니다.");

        } else if (role.equals("viewer")) {
            System.out.println("콘텐츠 조회만 가능합니다.");

        } else {
            System.out.println("정의되지 않은 역할입니다.");
        }


        // 8.
        System.out.print("나이를 입력하세요: ");
        int 나이 = scan.nextInt();

        if (나이 < 8) {
            System.out.println("무료");

        } else if (나이 <= 19) {
            System.out.println("5,000원");

        } else if (나이 < 65) {
            System.out.println("10,000원");

        } else {
            System.out.println("3,000원");
        }


        // 9.
        System.out.print("점수를 입력하세요: ");
        int 등급점수 = scan.nextInt();

        if (등급점수 >= 90) {
            System.out.println("A등급");

        } else if (등급점수 >= 80) {
            System.out.println("B등급");

        } else if (등급점수 >= 70) {
            System.out.println("C등급");

        } else {
            System.out.println("재시험");
        }


        // 10.
        System.out.print("총 구매 금액: ");
        int 구매금액 = scan.nextInt();

        int 할인금액;

        if (구매금액 >= 50000) {
            할인금액 = 구매금액 * 10 / 100;

        } else if (구매금액 >= 30000) {
            할인금액 = 구매금액 * 5 / 100;

        } else if (구매금액 >= 10000) {
            할인금액 = 구매금액 * 1 / 100;

        } else {
            할인금액 = 0;
        }

        int 최종결제금액 = 구매금액 - 할인금액;

        System.out.println("최종 결제 금액: " + 최종결제금액 + "원");


        // 11.
        System.out.print("월(1~12)을 입력하세요: ");
        int 월 = scan.nextInt();

        if (월 == 3 || 월 == 4 || 월 == 5) {
            System.out.println("봄");

        } else if (월 == 6 || 월 == 7 || 월 == 8) {
            System.out.println("여름");

        } else if (월 == 9 || 월 == 10 || 월 == 11) {
            System.out.println("가을");

        } else if (월 == 12 || 월 == 1 || 월 == 2) {
            System.out.println("겨울");

        } else {
            System.out.println("잘못된 월입니다.");
        }


        // 12.
        System.out.print("첫 번째 정수: ");
        int 숫자1 = scan.nextInt();

        System.out.print("두 번째 정수: ");
        int 숫자2 = scan.nextInt();

        System.out.print("세 번째 정수: ");
        int 숫자3 = scan.nextInt();

        int 가장큰수 = 숫자1;

        if (숫자2 > 가장큰수) {
            가장큰수 = 숫자2;
        }

        if (숫자3 > 가장큰수) {
            가장큰수 = 숫자3;
        }

        System.out.println("가장 큰 수: " + 가장큰수);


        // 13.
        System.out.print("연도를 입력하세요: ");
        int year = scan.nextInt();

        if ((year % 4 == 0 && year % 100 != 0)
                || year % 400 == 0) {

            System.out.println(year + "년은 윤년입니다.");

        } else {
            System.out.println(year + "년은 평년입니다.");
        }

        // 14.
        System.out.print("첫 번째 정수: ");
        int a = scan.nextInt();

        System.out.print("두 번째 정수: ");
        int b = scan.nextInt();

        System.out.print("세 번째 정수: ");
        int c = scan.nextInt();

        int temp;

        // a가 b보다 크면 서로 교환
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        // a가 c보다 크면 서로 교환
        if (a > c) {
            temp = a;
            a = c;
            c = temp;
        }

        // b가 c보다 크면 서로 교환
        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }

        System.out.println(a + ", " + b + ", " + c);

        // 15.
        System.out.print("플레이어1 (0:가위, 1:바위, 2:보): ");
        int player1 = scan.nextInt();

        System.out.print("플레이어2 (0:가위, 1:바위, 2:보): ");
        int player2 = scan.nextInt();

        if (player1 == player2) {

            System.out.println("무승부");

        } else if (
                (player1 == 0 && player2 == 2) ||
                (player1 == 1 && player2 == 0) ||
                (player1 == 2 && player2 == 1)
        ) {

            System.out.println("플레이어1 승리");

        } else {

            System.out.println("플레이어2 승리");
        }

    } // main end

} // class end