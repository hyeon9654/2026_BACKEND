package waiting.model.dao;

import java.util.ArrayList;
import waiting.model.dto.WaitingDto;

public class WaitingDao {

    private WaitingDao(){}
    private static final WaitingDao instance = new WaitingDao();
    public static WaitingDao getInstance(){
        return instance;
    }

    private ArrayList<WaitingDto> waitingList = new ArrayList<>();

    public boolean save(WaitingDto waitingDto){
    waitingList.add(waitingDto);
    return true;
    }
}
/*
Controller에게 받은 WaitingDto를
DAO의 ArrayList에 저장하고
성공 의미로 true 반환
 */