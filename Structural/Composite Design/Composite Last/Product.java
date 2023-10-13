import java.math.BigDecimal;


public class Product implements Affordable {
    private String name;
    private BigDecimal price;


    public Product(String name, BigDecimal price){
        this.name = name;
        this.price = price;
    }


    @Override
    public BigDecimal getPrice() {
        return price;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setPrice(BigDecimal price) {
        this.price = price;
    }



}
