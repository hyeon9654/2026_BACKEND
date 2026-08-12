package waiting.view;

import java.util.ArrayList;
import java.util.Scanner;
import waiting.model.dto.WaitingDto;
import waiting.controller.WaitingController;

public class WaitingView {
    private Scanner scan = new Scanner(System.in);
    private WaitingView(){}
    private static final WaitingView instance = new WaitingView();

    public static WaitingView getInstance(){
        return instance;
    }

    private WaitingController wc = WaitingController.getInstance();

    public void run(){
    while(true){
        System.out.println("============ 대기명단 관리 ============");
        System.out.println("1. 대기등록 2. 전체조회 0. 종료");
        System.out.println("======================================");
        System.out.print("선택 > ");

        int ch = scan.nextInt();

        if(ch == 1){
            save();
        }else if(ch == 2){
            findAll();
        }else if(ch == 0){
            System.out.println("[안내] 프로그램을 종료합니다.");
            break;
        }
    }
}
    public void save(){
    System.out.print("전화번호 : ");
    String phone = scan.next();

    System.out.print("방문 인원수 : ");
    int count = scan.nextInt();

    WaitingDto waitingDto = new WaitingDto(phone, count);

    boolean result = wc.save(waitingDto);

    if(result){
        System.out.println("[안내] 등록 성공");
    }else{
        System.out.println("[안내] 등록 실패");
    }
}
    public void findAll(){
    ArrayList<WaitingDto> result = wc.findAll();

    for(WaitingDto waitingDto : result){
        System.out.println("전화번호 : " + waitingDto.getPhone());
        System.out.println("방문 인원수 : " + waitingDto.getCount());
        System.out.println("----------------------");
    }
}
}