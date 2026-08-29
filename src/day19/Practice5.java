package day19;

import java.util.Scanner;

public class Practice5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // 1.
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // 2.
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        // 3.
        int sum3 = 0;

        for (int i = 1; i <= 50; i++) {
            sum3 += i;
        }
        System.out.println("1부터 50까지의 합계: " + sum3);

        // 4.
        for (int i = 1; i <= 20; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // 5.
        for (int i = 1; i <= 30; i++) {

            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }

        // 6.
        int sum6 = 0;

        for (int i = 1; ; i++) {

            sum6 += i;

            if (sum6 > 100) {
                System.out.println(i + "까지 더했을 때 합계가 " + sum6 + "로 100을 넘습니다.");
                break;
            }
        }

        // 7.
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 8.
        for (int i = 5; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 9.
        int count = 0;

        for (;;) {

            System.out.print((count + 1) + "회 입력 : ");
            String text = scan.next();

            if (text.equals("end")) {
                System.out.println("[안내] 프로그램을 종료 합니다.");
                System.out.println("[총 " + count + "회 입력]");
                break;
            }
            count++;
        }

        // 10.
        int july1 = 3532100;
        int july2 = 9123700;
        int july3 = 5183400;
        int july4 = 11738700;

        int july1만원 = july1 / 10000;
        int july2만원 = july2 / 10000;
        int july3만원 = july3 / 10000;
        int july4만원 = july4 / 10000;

        System.out.println("------- 7월 매출액 -------");

        System.out.print("1주차 : ");
        for (int i = 1; i <= july1만원 / 100; i++) {
            System.out.print("■");
        }
        System.out.println(july1만원 + "만원");

        System.out.print("2주차 : ");
        for (int i = 1; i <= july2만원 / 100; i++) {
            System.out.print("■");
        }
        System.out.println(july2만원 + "만원");

        System.out.print("3주차 : ");
        for (int i = 1; i <= july3만원 / 100; i++) {
            System.out.print("■");
        }
        System.out.println(july3만원 + "만원");

        System.out.print("4주차 : ");
        for (int i = 1; i <= july4만원 / 100; i++) {
            System.out.print("■");
        }
        System.out.println(july4만원 + "만원");

        // 11.
        int balance = 0;

        for (;;) {
            System.out.println("---------------------------------");
            System.out.println("1:입금 | 2:출금 | 3:잔고 | 4:종료");
            System.out.println("---------------------------------");
            System.out.print("선택> ");
            int menu = scan.nextInt();
            if (menu == 1) {
                System.out.print("입금액> ");
                int money = scan.nextInt();
                balance += money;
            } else if (menu == 2) {
                System.out.print("출금액> ");
                int money = scan.nextInt();
                if (money > balance) {
                    System.out.println("잔고보다 큰 금액은 출금할 수 없습니다.");
                } else {
                    balance -= money;
                }
            } else if (menu == 3) {
                System.out.println("잔고> " + balance);
            } else if (menu == 4) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 메뉴입니다.");
            }
        }
    } // main end
} // class end