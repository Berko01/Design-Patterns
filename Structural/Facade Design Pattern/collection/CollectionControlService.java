package collection;

import debt.Debt;
import debt.EnumDebtType;
import legal.LegalControlService;
import restructuring.RestructuringControlService;

public class CollectionControlService {

    private RestructuringControlService restructuringControlService;
    private LegalControlService legalControlService;

    
    public CollectionControlService() {
        restructuringControlService = new RestructuringControlService();
        legalControlService = new LegalControlService();

    }

    public boolean isSuitableForCollection(Debt debt){

        

        boolean restructuringMustBeBroken = false;

        if(EnumDebtType.Restructuring.equals(debt.getDebtType())){
            restructuringMustBeBroken = restructuringControlService.isRestructuringShouldBeDisrupted(debt.getExpiryDate());
        }

        boolean inLegalProceedings = legalControlService.isInLegalProceedings(debt.getId());

        boolean isDebtSuitableForCollection = !(restructuringMustBeBroken || inLegalProceedings);

        return isDebtSuitableForCollection;
    }



}
