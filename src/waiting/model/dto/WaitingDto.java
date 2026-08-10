package waiting.model.dto;

public class WaitingDto {

    private String phone;
    private int count;

    public WaitingDto(){}

    public WaitingDto(String phone, int count){
        this.phone = phone;
        this.count = count;
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public int getCount(){
        return count;
    }

    public void setCount(int count){
        this.count = count;
    }
}