
public class address {

               private String Village;
               private String City;
               private String State;

public String getVillage() {
        return Village;
    }

    public void setHouseNo(String Village) {
        this.HouseNo = Village;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public address(String Village, String City, String State) {
       
        this.Village = Village;
        this.City = City;
        this.State = State;
    }

    public String address (){
        String addrProp =  Village: this.getvillage()+ " ,State : " + this.getState() + " ,City : " + this.getCity();
        return addrProp;
    }
    public address() {
        super();
    }
    
     
}