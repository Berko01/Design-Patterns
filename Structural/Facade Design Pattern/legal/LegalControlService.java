package legal;

import java.util.List;

public class LegalControlService {

    private LegalProcessEntityService legalProcessEntityService;


    public LegalControlService() {
        this.legalProcessEntityService = new LegalProcessEntityService();
    }


    public boolean isInLegalProceedings(Long debtId){

        List<Long> listOfDebtsInLegalProceedings = legalProcessEntityService.findAllLegalProceedings();

        boolean isInLegalProceedings = listOfDebtsInLegalProceedings.contains(debtId);


        if(isInLegalProceedings){
            System.out.println("Borç hukuksal işlemde. Tahsil Edilemez!" );
            
        }

        return isInLegalProceedings;
        

    }
    
}
