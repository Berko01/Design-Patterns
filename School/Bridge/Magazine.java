class Magazine extends AbstractCover {
    public Magazine(IColor color, ISize size) {
        super(color, size);
    }

    @Override
    void produceCover() {
        System.out.println("Magazine Cover Produced - Color: " + color.applyColor() + ", Size: " + size.applySize());
    }
}