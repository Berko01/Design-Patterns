
public class ReceiverBank {
    private String bankName;

    public ReceiverBank(String bankName) {
        this.bankName = bankName;
    }

    public void add(){
        System.out.println(bankName + "adli banka sisteme eklendi.");
    }

    public void delete(){
        System.out.println(bankName + "adli banka sistemden silindi.");
    }

    
}
