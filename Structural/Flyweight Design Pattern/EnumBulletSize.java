public enum EnumBulletSize {

    SMALL(3),
    MEDIUM(5),
    LARGE(7)
    ;

    private int size;

    EnumBulletSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return String.valueOf(size);
    }

    public int getSize() {
        return size;
    }
}