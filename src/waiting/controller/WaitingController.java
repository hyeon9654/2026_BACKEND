package waiting.controller;

import waiting.model.dao.WaitingDao;
import waiting.model.dto.WaitingDto;

public class WaitingController {

    private WaitingController(){}

    private static final WaitingController instance = new WaitingController();

    public static WaitingController getInstance(){
        return instance;
    }

    private WaitingDao wd = WaitingDao.getInstance();

    public boolean save(WaitingDto waitingDto){
    boolean result = wd.save(waitingDto);
    return result;
}
}
/*
View에게 받은 WaitingDto를
Dao에게 전달하고
Dao가 준 결과를 다시 View에게 돌려줌
 */