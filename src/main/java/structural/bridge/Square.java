package structural.bridge;

/**
 * 
 * @author softgroup_dmitriy
 *
 */
class Square implements Shape {
  private Color color;

  public Square(Color color) {
    this.color = color;
  }

  @Override
  public void draw() {
    System.out.println("Fill the shape with color");
    color.setColor();
  }

  @Override
  public Color getColor() {
    return color;
  }
}
