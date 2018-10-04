package structural.bridge;

/**
 * 
 * @author softgroup_dmitriy
 *
 */
class Triangle implements Shape {
  private Color color;

  public Triangle(Color color) {
    this.color = color;
  }

  @Override
  public void draw() {
    System.out.println("Setting color for the shape triangle");
    color.setColor();
  }

  @Override
  public Color getColor() {
    return color;
  }
}
