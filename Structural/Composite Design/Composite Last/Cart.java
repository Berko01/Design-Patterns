import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Cart {

    private String name;
    private List<Affordable> affordableList;

    public Cart(String name) {
        this.name = name;
        this.affordableList = new ArrayList<>();
    }

    public BigDecimal totalAmountToBePaid(){
        BigDecimal totalAmount = BigDecimal.ZERO;

        for(Affordable affordable : affordableList){
            totalAmount = totalAmount.add(affordable.getPrice());
        }

        return totalAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Affordable> getAffordableList() {
        return affordableList;
    }

    public void setAffordableList(List<Affordable> affordableList) {
        this.affordableList = affordableList;
    }

}
