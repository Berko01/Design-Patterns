public class BridgePattern {
    public static void main(String[] args) {
        
        AbstractCover book1 = new Book(new BlueColor(), new A4Size());
        book1.produceCover();


        AbstractCover magazine1 = new Magazine(new RedColor(), new A5Size());
        magazine1.produceCover();
    }
}