package TaxServiceNormal;

public class PayService {
    private DeliverService deliverService = new DeliverService();
    private TaxService taxService = new TaxService();

    public double finalPrice(double cost, String state){
        return cost + deliverService.fee(state) + taxService.tax(cost);
    }


}
