import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Pack implements Affordable{

    private String name;
    private List<Product> productList;

    public Pack(String name){
        this.name = name;
        this.productList = new ArrayList<>();
    }

    @Override
    public BigDecimal getPrice() {
        return PriceCalculationUtil.getTotalProductAmount(productList);
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getProductList() {
        return productList;
    }

    public void setProductList(List productList) {
        this.productList = productList;
    }



    
}