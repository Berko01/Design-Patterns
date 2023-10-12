package prototype;

public class GeneralEntityService {

    //Burasını veri tabanı gibi hayal edebiliriz.
    public DocumentType findDocumentTypeById(Long id) {
        try {
            Thread.sleep(1000); // maliyetli belge. Her eleman için database'e gitcek gibi düşünelim.
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        DocumentType documentType = new DocumentType(id);
        documentType.setId(id);

        String name;
        if (id.compareTo(1L) == 0) {
            name = "Kisisel";
        } else if (id.compareTo(2L) == 0) {
            name = "Kurumsal";
        } else {
            name = "Genel";
        }

        documentType.setName(name);

        return documentType;

    }

    public Category findCategoryById(Long id) {
        try {
            Thread.sleep(1000); // maliyetli belge. Her eleman için database'e gitcek gibi düşünelim.
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Category category = new Category(id);
        category.setId(id);

        String name;
        if (id.compareTo(1L) == 0) {
            name = "Ozel";
        } else if (id.compareTo(2L) == 0) {
            name = "Is";
        } else {
            name = "Genel";
        }

        category.setName(name);

        return category;

    }

    public Document findDocumentById(Long id){
        try {
            System.out.println("Loading...\n");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Document document = new Document();
        document.setId(id);
        document.setDocumentType(findDocumentTypeById(id));
        document.setCategory(findCategoryById(id));
        
        String name;
        String data;
        if (id.compareTo(1L) == 0) {
            name = "Mektup";
            data = "Sevgili dostum Ahmet, ....";
        } else if (id.compareTo(2L) == 0) {
            name = "Rapor";
            data = "Bu rapor genel müdüre verilmek üzere hazırlanmıştır.";
        } else {
            name = "Trafik Kuralları";
            data = "Sağa dönüşte yayaya yol ver.";
        }

        document.setName(name);
        document.setData(data);

        return document;
    }


}
