public class Main {
    public static void main(String[] args) {
        A5Size a5Size = new A5Size();
        A4Size a4Size = new A4Size();

        BlueColor blueColor = new BlueColor();
        RedColor redColor = new RedColor();
        
        Magazine magazine = new Magazine(redColor, a4Size);
        Book book = new Book(blueColor, a5Size);

        magazine.produceCover();
        book.produceCover();
    }
}
