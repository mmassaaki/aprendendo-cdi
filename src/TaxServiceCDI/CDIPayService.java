package TaxServiceCDI;

import TaxServiceNormal.DeliverService;
import TaxServiceNormal.TaxService;

public class CDIPayService {

    private CDIDeliverService cdiDeliverService;
    private CDITaxService cdiTaxService;
    public CDIPayService(CDITaxService cdiTaxService, CDIDeliverService cdiDeliverService){
        this.cdiTaxService = cdiTaxService;
        this.cdiDeliverService =cdiDeliverService;
    }
}
