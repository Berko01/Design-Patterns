

public class ShapeBuilder implements IBuilder {

    Shape abstractShape;

    

    public ShapeBuilder() {
        abstractShape = new Shape();
    }

    @Override
    public ShapeBuilder createInnerColorOfShape(String color) {
        abstractShape.setInnerColorOfShape(color);        
        return  this;
    }

    @Override
    public ShapeBuilder createMathCoordinateofShape(Coordinate coordinate) {
      
        abstractShape.setCoordinate(coordinate);
        return  this;
      
    }

    @Override
    public ShapeBuilder createSideCount(int count) {
        abstractShape.setNumberOfSides(count);
        return  this;
       
    }

    @Override
    public ShapeBuilder createSideThickness(int thickness) {
        abstractShape.setEdgeThickness(thickness);
        return this;
    }

    public Shape getShape(){
        return abstractShape;
    }
    
}
