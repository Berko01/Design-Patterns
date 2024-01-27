abstract class AbstractCover {
    protected IColor color;
    protected ISize size;

    public AbstractCover(IColor color, ISize size) {
        this.color = color;
        this.size = size;
    }

    abstract void produceCover();
}
