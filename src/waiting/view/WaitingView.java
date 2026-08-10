package waiting.view;

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
}