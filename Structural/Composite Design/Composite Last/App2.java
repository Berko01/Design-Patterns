import java.math.BigDecimal;

public class App2 {
    public static void main(String[] args) {
        Product tomatoes = new Product("Domates", BigDecimal.TEN);
        Product patatoes = new Product("Patates", BigDecimal.ONE);
        Product onion = new Product("Onion", BigDecimal.ONE);

        Pack vegetablePack = new Pack("Sebze Paketi");
        vegetablePack.getProductList().add(tomatoes);
        vegetablePack.getProductList().add(patatoes);
        vegetablePack.getProductList().add(onion);

        Product soundSystem = new Product("Ses Sistemi", BigDecimal.valueOf(5000));
        Product earPhones = new Product("Earphones", BigDecimal.valueOf(5000));
        Pack technologyPack = new Pack("Teknoloji Paketi");
        technologyPack.getProductList().add(soundSystem);
        technologyPack.getProductList().add(earPhones);

        Product soccerBall = new Product("Soccer Ball", BigDecimal.valueOf(100));

        Stores stores = new Stores("Ramazan Kumanyasi");

        Product oil = new Product("Yag", BigDecimal.valueOf(50));

        stores.getPackList().add(vegetablePack);
        stores.getProducList().add(oil);

        Cart cart = new Cart("Benim Sepetim");
        cart.getAffordableList().add(vegetablePack);
        cart.getAffordableList().add(technologyPack);
        cart.getAffordableList().add(soccerBall);
        cart.getAffordableList().add(stores);

        BigDecimal totalAmount = cart.totalAmountToBePaid();

        System.out.println("Odenecek tutar = " + totalAmount + " tl");

    }
}
