/* James Dinh
 * 02/07/15
 * Purpose: Demonstrate polymorphism with geometric objects
 * Input: Rectangle's height and width
 * Output: Object's state and measurements
 */
public class Rectangle extends GeometricObject {
  // instance variables
  private double height;
  private double width;
  
  // default Rectangle
  public Rectangle() {
    super();
    height = 1;
    width = 1; 
  }
  
  // default Rectangle with specified color and filled
  public Rectangle(String color, boolean filled) {
    super(color, filled);
    height = 1;
    width = 1; 
  }
  
  // Constructor for specified height and width
  public Rectangle(double height, double width) {
    super();
    this.height = height;
    this.width = width;
  }
  
  // Constructor for specified color, filled, height, and width
  public Rectangle(String color, boolean filled, double height, double width) {
    super(color, filled);
    this.height = height;
    this.width = width;
  }
  
  // change height to specified value
  public void setHeight(double height) {
   this.height = height; 
  }
  
  // change width to specified value
  public void setWidth(double width) {
   this.width = width; 
  }
  
  // return height
  public double getHeight() {
   return height; 
  }
  
  // return width
  public double getWidth() {
   return width; 
  }
  
  // return perimeter of a rectangle
  public double getPerimeter() {
   return 2 * (width + height);
  }
  
  //return area of a rectangle
  public double getArea() {
   return width * height; 
  }
  
  // Return string representation of a Circle
  public String toString() {
   return "Rectangle created on: " + getDateCreated() + "\nColor: " + getColor()
     + " and filled: " + isFilled() + "\nHeight: " + height + " and Width: " + width;
  }
  
  public Double getMeasure() {
    return getArea();
  }
}
