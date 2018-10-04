package structural.facade;

/**
 * 
 * @author softgroup_dmitriy
 *
 */
class ProgramNode {

  private String statementNode;
  private String expressionNode;
  private String variableNode;

  public ProgramNode(ProgramNodeBuilder programNodeBuilder) {
    this.statementNode = programNodeBuilder.statementNode;
    this.expressionNode = programNodeBuilder.expressionNode;
    this.variableNode = programNodeBuilder.variableNode;
  }

  public static class ProgramNodeBuilder {
    private String statementNode;
    private String expressionNode;
    private String variableNode;

    public ProgramNodeBuilder setStatementNode(String statementNode) {
      this.statementNode = statementNode;
      return this;
    }

    public ProgramNodeBuilder setExpressionNode(String expressionNode) {
      this.expressionNode = expressionNode;
      return this;
    }

    public ProgramNodeBuilder setVariableNode(String variableNode) {
      this.variableNode = variableNode;
      return this;
    }

    public ProgramNode build() {
      return new ProgramNode(this);
    }
  }

  @Override
  public String toString() {
    return " The program include: ProgramNode [statementNode=" + statementNode + ", expressionNode="
        + expressionNode + ", variableNode=" + variableNode + "]";
  }
}
