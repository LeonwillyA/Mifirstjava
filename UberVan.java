import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {
    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    
    
    public UberVan (String license, Account driver){
        super(license, driver);
    }    
    

    /*public UberVan (String license, Account driver, Map<String, Map<String,Integer>> typeCarAccepted,
    ArrayList<String> seatsMaterial){
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }*/
    
    @Override
    public void setPassenger(Integer passegenger) {
        if (passegenger == 6){
            this.passegenger = passegenger;
        }else {
            System.out.println("Necesitas asignar 6s");
        }
    }
}