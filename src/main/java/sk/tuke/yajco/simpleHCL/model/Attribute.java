package sk.tuke.yajco.simpleHCL.model;


import yajco.annotation.Before;
import yajco.annotation.Token;

public class Attribute {
    private String name;
    private Expression expression;

    public Attribute(@Token("name") String name, @Before("=") Expression expression) {
        this.name = name;
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
