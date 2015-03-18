/* James Dinh
 * 02/07/15
 * Purpose: Demonstrate polymorphism with geometric objects
 * Input: Attributes of different geometric objects
 * Output: Object's state and measurements
 */
import java.util.ArrayList;
public class GeometricObjectTester {
  public static void main(String[] arghs) {
    ArrayList<GeometricObject> geomObjs = new ArrayList<GeometricObject>();
    // Create 12 objects. 3 shapes, 4 constructors each
    GeometricObject circle = new Circle(12);
    GeometricObject defaultCircle = new Circle();    
    GeometricObject square = new Rectangle(15, 15);
    GeometricObject defaultTriangle = new Triangle();
    GeometricObject defaultRectangle = new Rectangle();
    GeometricObject rightTriangle = new Triangle(3, 4, 5);
    GeometricObject pie = new Circle("green", false, 3.14);
    GeometricObject colorRect = new Rectangle("pink", true);
    GeometricObject rect = new Rectangle("blue", false, 4, 6);
    GeometricObject colorTriangle = new Triangle("red", false);
    GeometricObject coloredCircle = new Circle("magenta", true);    
    GeometricObject triangle = new Triangle("purple", true, 3, 4, 5);
    
    // Method testing for each shape
    Circle cCircle = (Circle) circle;
    cCircle.setRadius(2);
    System.out.println("white, unfilled circle's diameter after: " + cCircle.getDiameter());
    
    Rectangle rectDefault = (Rectangle) defaultRectangle;
    rectDefault.setHeight(3);
    rectDefault.setWidth(4);
    System.out.println("defaultRectangle's height and width after: " + rectDefault.getHeight() + ", " + rectDefault.getWidth());
    
    Triangle halfRectangle = (Triangle) colorTriangle;
    halfRectangle.setSides(3, 6, 5); // input validation
    halfRectangle.setSide1(6);
    halfRectangle.setSide2(3);
    halfRectangle.setSide3(1);
    System.out.println("colorTriangle's side1, side2, and side3 after: " + halfRectangle.getSide1() + ", " + halfRectangle.getSide2() + ", " + halfRectangle.getSide3());
    
    // Add shapes to list
    geomObjs.add(circle);
    geomObjs.add(defaultCircle);
    geomObjs.add(square);
    geomObjs.add(defaultTriangle);
    geomObjs.add(defaultRectangle);
    geomObjs.add(rightTriangle);
    geomObjs.add(pie);
    geomObjs.add(colorRect);
    geomObjs.add(rect);
    geomObjs.add(colorTriangle);
    geomObjs.add(coloredCircle);
    geomObjs.add(triangle);
    
    // loop for polymorphism
    for (GeometricObject geoObj : geomObjs) {
      System.out.println(geoObj.toString());
      System.out.println("Perimeter: " + geoObj.getPerimeter() + "\nArea: " + geoObj.getArea() + "\n");
    } 
    // Test max()
    GeometricObject.max(circle, pie);
    GeometricObject.max(square, rect);
    GeometricObject.max(triangle, rightTriangle);
  }
}
