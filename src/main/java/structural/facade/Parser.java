package structural.facade;

/**
 * 
 * @author softgroup_dmitriy
 *
 */
class Parser {

  public String parse(String str) {
    System.out.println("syntactic analyze");
    return str.substring(0, 4);
  }
}
