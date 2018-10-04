package structural.facade;

/**
 * This is our facade class;
 * 
 * @author softgroup_dmitriy
 * 
 *
 */
class Compiler {

  private Parser parser;
  private Scanner scanner;
  private ProgramNode programNode;

  public Compiler() {
    scanner = new Scanner();
    parser = new Parser();
  }

  public void compile(String ourCode) {
    scanner.scan(ourCode);
    String node = parser.parse(ourCode);
    programNode = new ProgramNode.ProgramNodeBuilder().setExpressionNode(node).build();
    System.out.println(programNode);
  }
}

