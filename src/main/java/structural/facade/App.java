package structural.facade;

/**
 * 
 * @author softgroup_dmitriy
 *
 */
class App {
  public static void main(String[] args) {
    Compiler compiler = new Compiler();
    compiler.compile("int a;");
  }
}
