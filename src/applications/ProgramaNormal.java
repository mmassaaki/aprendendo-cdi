package applications;

import TaxServiceNormal.PayService;

public class ProgramaNormal {
    public static void main(String[] args) {
        PayService payService = new PayService();
        System.out.println("Resultado SP " + payService.finalPrice(300, "SP"));
        System.out.println("Resultado SC " + payService.finalPrice(300, "SC"));
    }
}
