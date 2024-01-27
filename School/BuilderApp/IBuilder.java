public interface IBuilder {
    public IBuilder createInnerColorOfShape(String color);
    public IBuilder createMathCoordinateofShape(Coordinate coordinate);
    public IBuilder createSideCount(int count);
    public IBuilder createSideThickness(int thickness);
}
