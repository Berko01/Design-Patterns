package CompositeFirst;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Cart {
    private String name;
    private List<Product> productList;
    private List<Pack> packList;
    private List<Store> storeList; 
    public Cart(String name) {
        this.name = name;
        this.productList = new ArrayList<>();
        this.packList = new ArrayList<>();
        this.storeList = new ArrayList<>();
    }

    public BigDecimal getTotalAmount() {
        BigDecimal totalAmount = BigDecimal.ZERO;

        for (Product product : productList) {
            totalAmount = totalAmount.add(product.getPrice());
        }

        for (Pack pack : packList) {
            List<Product> productList = pack.getProductList();

            for (Product product : productList) {
                totalAmount = totalAmount.add(product.getPrice());
            }
        }


        for(Store store: storeList){

            List<Product> productList = store.getProductList();
            List<Pack> packList = store.getPackList();

            for (Product product : productList) {
                totalAmount = totalAmount.add(product.getPrice());
                
            }

            for (Pack pack : packList) {
                List<Product> productList2= pack.getProductList();

                for(Product product: productList2){

                    totalAmount = totalAmount.add(product.getPrice());
                }
                
            }
        }

        return totalAmount;
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
