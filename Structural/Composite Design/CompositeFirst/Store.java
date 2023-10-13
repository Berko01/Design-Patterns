package CompositeFirst;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private String name;
    private List<Product> productList;
    private List<Pack> packList;

    public Store(String name){
        this.name = name;
        this.productList = new ArrayList<>();
        this.packList = new ArrayList<>();
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<Pack> getPackList() {
        return packList;
    }

    public void setPackList(List<Pack> packList) {
        this.packList = packList;
    }

    
}
