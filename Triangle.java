/* James Dinh
 * 02/07/15
  * Purpose: Demonstrate polymorphism with geometric objects
 * Input: Triangle's 3 sides
 * Output: Object's state and measurements
 */
public class Triangle extends GeometricObject {
  
  // instance variables
  private double side1, side2, side3;
  
  // The sum of any two sides of a triangle MUST BE GREATER than the third side
  // The above condition MUST be satisfied by ALL 3 SIDES
  // side1 + side2 > side3
  // side2 + side3 > side1
  // side3 + side1 > side2
  
  // default Triangle
  public Triangle() {
    side1 = 1;
    side2 = 1;
    side3 = 1;
  }
  
  // default Triangle with specified color and filled
  public Triangle(String color, boolean filled) {
    super(color, filled); 
    side1 = 1;
    side2 = 1;
    side3 = 1;
  }
  
  // constructor for specified sides
  public Triangle(double side1, double side2, double side3) {
    super();
    if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) {
      this.side1 = side1;
      this.side2 = side2;
      this.side3 = side3;
    } else {
      System.out.println("Invalid Triangle. Default values assumed.");
      this.side1 = 1;
      this.side2 = 1;
      this.side3 = 1;
    }
  }
  
  // constructor for specified values
  public Triangle(String color, boolean filled, double side1, double side2, double side3) {
    super(color, filled);
    if (side1 + side2 > side3 && side2 + side3 > side1  && side1 + side3 > side2) {
      this.side1 = side1;
      this.side2 = side2;
      this.side3 = side3;
    } else {
      System.out.println("Invalid Triangle. Default values assumed.");
      this.side1 = 1;
      this.side2 = 1;
      this.side3 = 1;
    }
  }
  
  // change all 3 sides
  public void setSides(double side1, double side2, double side3) {
    if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) {
     this.side1 = side1;
     this.side2 = side2;
     this.side3 = side3;
    } else
      System.out.println("Invalid sides of a triangle. Changes will be ignored.");
  }
 
  // Change side1 to specified value
  public void setSide1(double side1) {
    if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) 
      this.side1 = side1;
    else 
      System.out.println("Invalid triangle side");     
  }
  
  // Change side2 to specified value
  public void setSide2(double side2) {
    if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2)
      this.side2 = side2;
    else 
      System.out.println("Invalid triangle side"); 
  }
  
  // Change side3 to specified value
  public void setSide3(double side3) {
    if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2)
      this.side3 = side3;
    else 
      System.out.println("Invalid triangle side"); 
  }
  
  // Return side 1
  public double getSide1() {
    return side1; 
  }
  
  // Return side 2
  public double getSide2() {
    return side2; 
  }
  
  // Return side 3
  public double getSide3() {
    return side3; 
  }
  
  // Return perimeter of a triangle
  public double getPerimeter() {
   return side1 + side2 + side3; 
  }
  
  // Return area of a triangle
  // A = sqrt(s(s-a)(s-b)(s-c)), where s is half the perimeter and a, b, c are sides of the triangle
  public double getArea() {
   return Math.sqrt((getPerimeter()/2) * (getPerimeter()/2 - side1) * (getPerimeter()/2 - side2) * (getPerimeter()/2 - side3));
  }
  
    // Return string representation of a Circle
  public String toString() {
   return "Triangle created on: " + getDateCreated() + "\nColor: " + getColor()
     + " and filled: " + isFilled() + "\nSide 1: " + side1
     + ", Side 2: " + side2 + ", and Side 3: " + side3;
  }
  
  public Double getMeasure() {
    return getArea();
  }
}
