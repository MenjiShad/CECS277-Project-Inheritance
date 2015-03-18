/* James Dinh
 * 02/07/15
 * Purpose: Demonstrate polymorphism with geometric objects
 * Input: Objects color, and whether it is filled or not
 * Output: Object's state and measurements
 */
public abstract class GeometricObject extends GenericMeasurable<Double> implements Comparable<GeometricObject> {
  
  private String color = "white";
  private boolean filled;
  private java.util.Date dateCreated;
  
  /** Construct a default geometric object */
  public GeometricObject() {
    dateCreated = new java.util.Date();
  }
  
  /** Construct a geometric object with the specified color
    *  and filled value */
  public GeometricObject(String color, boolean filled) {
    dateCreated = new java.util.Date();
    this.color = color;
    this.filled = filled;
  }
  
  /** Return color */
  public String getColor() {
    return color;
  }
  
  /** Set a new color */
  public void setColor(String color) {
    this.color = color;
  }
  
  /** Return filled. Since filled is boolean,
    its get method is named isFilled */
  public boolean isFilled() {
    return filled;
  }
  
  /** Set a new filled */
  public void setFilled(boolean filled) {
    this.filled = filled;
  }
  
  /** Get dateCreated */
  public java.util.Date getDateCreated() {
    return dateCreated;
  }
  
  /** Return a string representation of this object */
  public String toString() {
    return "created on " + dateCreated + "\ncolor: " + color +
      " and filled: " + filled;
  }
  
  // Abstract method for Area calculations
  public abstract double getArea();
  
  // Abstract method for Perimeter calculations
  public abstract double getPerimeter();
  
  // Uses the compareTo method to find which geometric object is larger by area
  public static void max(GeometricObject geomObjA, GeometricObject geomObjB) {
    if (geomObjA.compareTo(geomObjB) > 0)
      System.out.println("The first geometric object is larger by area.");
    else if (geomObjA.compareTo(geomObjB) < 0)
      System.out.println("The second geometric object is larger by area.");
    else
      System.out.println("The two geometric objects are the same size by area.");
  }
  
  // From Comparable interface: compares two objects
  public int compareTo(GeometricObject otherGeomObj) {
    if (getArea() > otherGeomObj.getArea()) {return 1;}
    if (getArea() < otherGeomObj.getArea()) {return -1;}
    return 0;
  }
}
