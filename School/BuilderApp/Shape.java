public class Shape {
    Coordinate coordinate;
    int numberOfSides;
    String innerColorOfShape;
    int edgeThickness;
    public Coordinate getCoordinate() {
        return coordinate;
    }
    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }
    public int getNumberOfSides() {
        return numberOfSides;
    }
    public void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }
    public String getInnerColorOfShape() {
        return innerColorOfShape;
    }
    public void setInnerColorOfShape(String innerColorOfShape) {
        this.innerColorOfShape = innerColorOfShape;
    }
    public int getEdgeThickness() {
        return edgeThickness;
    }
    public void setEdgeThickness(int edgeThickness) {
        this.edgeThickness = edgeThickness;
    }
    @Override
    public String toString() {
        return "AbstractShape [coordinate=(" + coordinate.x + "," +coordinate.y + ")"  + ", numberOfSides=" + numberOfSides + ", innerColorOfShape="
                + innerColorOfShape + ", edgeThickness=" + edgeThickness + "]";
    }

    
}
