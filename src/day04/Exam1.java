package day04;

public class Exam1 {
    public static void main(String[] args) {
        
        // 조건문 : if( true/false ) 실행문;
        int 온도 = 5;
        if( 온도 <= 10 ) System.out.println("외투 입는다.");


        // 조건문2 : if( true/false ){ 실행문; 실행문; }
        if( 온도 <= 10){
            System.out.println("외투 입는다.");
            System.out.println("긴바지 입는다.");
        }

        // 조건문3 : if( true/false ){ 실행문; } else{ 실행문; }
        if(온도 <= 10 ){    System.out.println("외투 입는다.");}
        else{   System.out.println("외투 입지 않는다.");}


        // 조건문4 : if( true/false ){ 실행문; } else if( true/false ){ 실행문; } else{ 실행문; }
        if( 온도 <= 10 ){ System.out.println("외투 입는다.");}
        else if( 온도 <= 15 ){ System.out.println("외투 입지 않는다.");}
        else if( 온도 <= 30 ){ System.out.println("반팔 입는다.");}
        else{ System.out.println("나시 입는다.");}

        // 1. 조건문 중첩 : if( ){ if() ()}
        // 2. 다수 조건의 다수 실행문 : if if if [ VS ] 다수 조건을 하나의 실행문 : if else if else if else
        // 3. swich : 값에 따른 흐름 제어 사용 ( 논리 true/false X )
        char grade = 'B';
        // switch( 자료 ){ case 값1 : 실행문; case 값2 : 실행문; case 값3 : 실행문; default : 실행문;}
        // 자료에 동일한 값이 case 존재하면 실행문 실행, 단 해당하는 case 부터 아래 case 모두 실행
        switch(grade){
            case 'A' : System.out.println("A등급 입니다.");
            case 'B' : System.out.println("B등급 입니다.");
            case 'C' : System.out.println("C등급 입니다.");
            default : System.out.println("재시험 입니다.");
        } // swich end

        switch( grade ){
            case 'A' :
            case 'B' : System.out.println("합격 입니다."); break;
            case 'C' : 
            default : System.out.println("재시험 입니다.");        
        } //swich end

        int adult = 1;
        switch (grade) {
            case 'A':
               switch( adult ){
                case 1 : System.out.println("A등급 성인입니다.");        break;
                case 0 : System.out.println("A등급 미성년자입니다.");    break;
               }                
            case 'B':
               switch( adult ){
                case 1 : System.out.println("B등급 성인입니다.");}  break;
                case 0 : System.out.println("B등급 미성년자입니다.");}  break;
        }


        // 반복문




    } // main end
}
