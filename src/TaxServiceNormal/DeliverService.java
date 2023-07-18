package TaxServiceNormal;

public class DeliverService {
    double fee(String state){
        if("SP".equalsIgnoreCase(state)){
            return 10.0;
        } return 20.0;
    }
}
