package day19;

import java.util.Arrays;
import java.util.Scanner;

public class Practice6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // 1.
        int[] numbers1 = {10, 20, 30, 40, 50};
        System.out.println(numbers1[2]);

        // 2.
        String[] season = new String[3];
        season[0] = "봄";
        season[1] = "여름";
        season[2] = "가을";
        System.out.println(Arrays.toString(season));

        // 3.
        String[] fruits = {"사과", "바나나", "포도", "딸기"};

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        // 4.
        int[] scores1 = {85, 92, 78, 65, 95};
        int sum4 = 0;

        for (int i = 0; i < scores1.length; i++) {
            sum4 += scores1[i];
        }

        double avg4 = (double) sum4 / scores1.length;
        System.out.println("합계: " + sum4);
        System.out.println("평균: " + avg4);

        // 5.
        int[] scores2 = {77, 82, 100, 54, 96};

        for (int i = 0; i < scores2.length; i++) {
            if (scores2[i] == 100) {
                System.out.println("100점 만점자를 찾았습니다!");
                break;
            }
        }

        // 6.
        String[] bloodTypes = {"A", "B", "O", "AB", "A", "B", "A"};
        int count6 = 0;

        for (int i = 0; i < bloodTypes.length; i++) {
            if (bloodTypes[i].equals("A")) {
                count6++;
            }
        }

        System.out.println("A형 혈액형 인원: " + count6 + "명");

        // 7.
        int[] numbers2 = {23, 5, 67, 12, 88, 34};
        int max7 = numbers2[0];

        for (int i = 1; i < numbers2.length; i++) {
            if (numbers2[i] > max7) {
                max7 = numbers2[i];
            }
        }

        System.out.println("가장 큰 값: " + max7);

        // 8.
        String[] products = {"볼펜", "노트", "지우개"};
        int[] stock = {10, 5, 20};

        System.out.print("구매할 상품명: ");
        String productName = scan.next();

        System.out.print("구매할 수량: ");
        int productCount = scan.nextInt();

        int productIndex = -1;

        for (int i = 0; i < products.length; i++) {
            if (products[i].equals(productName)) {
                productIndex = i;
                break;
            }
        }

        if (productIndex == -1) {
            System.out.println("없는 제품명입니다.");
        } else if (stock[productIndex] >= productCount) {
            stock[productIndex] -= productCount;
            System.out.println("구매 완료!");
            System.out.println("남은 재고: " + stock[productIndex]);
        } else {
            System.out.println("재고가 부족합니다.");
        }

        // 9.
        String[] movieNames = {"히든페이스", "위키드", "글래디에이터2", "청설"};
        int[] movieRatings = {8, 4, 7, 6};

        for (int i = 0; i < movieNames.length; i++) {
            System.out.print(movieNames[i] + " ");

            for (int j = 1; j <= movieRatings[i]; j++) {
                System.out.print("★");
            }

            for (int j = movieRatings[i]; j < 10; j++) {
                System.out.print("☆");
            }

            System.out.println();
        }

        // 10.
        String[] carNumbers = {"210어7125", "142가7415", "888호8888", "931나8234"};
        int[] usageMinutes = {65, 30, 140, 420};

        for (int i = 0; i < carNumbers.length; i++) {

            int fee = 1000;

            if (usageMinutes[i] > 30) {
                int extraMinutes = usageMinutes[i] - 30;
                fee += (extraMinutes / 10) * 500;
            }

            if (fee > 20000) {
                fee = 20000;
            }

            System.out.println(
                carNumbers[i] + ": " + usageMinutes[i] +
                "분 주차, 최종 요금: " + fee + "원"
            );
        }
    } // main end
} // class end