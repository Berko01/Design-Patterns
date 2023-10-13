import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Stores implements Affordable {

    private String name;
    private List producList;
    private List packList;

    public Stores(String name) {
        this.name = name;
        producList = new ArrayList<>();
        packList = new ArrayList<>();
    }

    @Override
    public BigDecimal getPrice() {
        BigDecimal totalProductAmount = PriceCalculationUtil.getTotalProductAmount(producList);
        BigDecimal totalPackAmount = PriceCalculationUtil.getTotalPackAmount(packList);

        BigDecimal totalAmount = totalProductAmount.add(totalPackAmount);

        return totalAmount;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getProducList() {
        return producList;
    }

    public void setProducList(List producList) {
        this.producList = producList;
    }

    public List getPackList() {
        return packList;
    }

    public void setPackList(List packList) {
        this.packList = packList;
    }

}
