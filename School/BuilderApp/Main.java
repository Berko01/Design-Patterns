public class Main{
    public static void main(String[] args) {
        ShapeBuilder shapeBuilder = new ShapeBuilder();
        Coordinate coordinate = new Coordinate(2,5);
        shapeBuilder.createInnerColorOfShape("red").createMathCoordinateofShape(coordinate).createSideCount(4).createSideThickness(100);

      System.out.println(shapeBuilder.getShape().toString());  

        


    }
}