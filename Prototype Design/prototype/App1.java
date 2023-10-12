package prototype;

import java.util.Date;

public class App1 {
    public static void main(String[] args) {
        GeneralEntityService generalEntityService = new GeneralEntityService();

        Long id1 = 1L;

        Date firstDate1 = new Date();
        Document document1 = generalEntityService.findDocumentById(id1);
        printDataAndSeccondDifference(document1, firstDate1);

        Long id2 = 2L;

        Date firstDate2 = new Date();
        Document document2 = generalEntityService.findDocumentById(id2);
        printDataAndSeccondDifference(document2, firstDate2);

        Date firstDate3 = new Date();
        Document documentClone = null;
        try {
            documentClone = document1.clone();
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        documentClone.setName("Gunluk");
        documentClone.setData("Sevgili Gunluk");
        documentClone.getDocumentType().setName("Kisisel 2");
        printDataAndSeccondDifference(documentClone, firstDate3);

        System.out.println(document1); //Shallow Copy
        

    }

    private static void printDataAndSeccondDifference(Document document1, Date firstDate) {
        Date lastDate = new Date();

        Long secondDifference = getSeccondDifference(firstDate,lastDate);

        System.out.println(document1 + "\n");
        System.out.println(secondDifference);
      
    }

    private static Long getSeccondDifference(Date firstDate, Date lastDate) {
        long has = 1000;

        long secondDifference = (lastDate.getTime() / has) - (firstDate.getTime() / has);

        return secondDifference;
    }
    
}
