class Book extends AbstractCover {
    public Book(IColor color, ISize size) {
        super(color, size);
    }

    @Override
    void produceCover() {
        System.out.println("Book Cover Produced - Color: " + color.applyColor() + ", Size: " + size.applySize());
    }
}

