/* James Dinh
 * 02/07/15
 * Purpose: Demonstrate polymorphism with geometric objects
 * Input: Circle's radius
 * Output: Object's state and measurements
 */
public class Circle extends GeometricObject {
 
  // instance variables
  private double radius;
  private final double PI = 3.141592653;
  
  // default Circle
  public Circle() {  
    super();
    radius = 1;
  }
  
  // default Circle with specified color and filled
  public Circle(String color, boolean filled) {
    super(color, filled);
    radius = 1;
  }
    
  // constructor for specified radius
  public Circle(double radius) {
    super();
    this.radius = radius;
  }
  
  // constructor for specified radius, color, and filled
  public Circle(String color, boolean filled, double radius) {
   super(color, filled);
   this.radius = radius;
  }
  
  // change radius to specified value
  public void setRadius(double radius) {
   this.radius = radius; 
  }
  
  // Return the diameter
  public double getDiameter() {
    return 2 * radius;
  }
   
  // Return perimeter of a circle
  public double getPerimeter() {
    return 2 * PI * radius;
  }
  
  // Return area of a circle
  public double getArea() {
    return PI * radius * radius;
  }
  
    // Return string representation of a Circle
  public String toString() {
   return "Circle created on: " + getDateCreated() + "\nColor: " + getColor()
     + " and filled: " + isFilled() + "\nRadius: " + radius;
  }
  
  public Double getMeasure() {
    return getArea();
  }
}
