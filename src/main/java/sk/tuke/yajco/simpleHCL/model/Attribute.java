package sk.tuke.yajco.simpleHCL.model;


import yajco.annotation.Before;
import yajco.annotation.Token;

public class Attribute {
    private String name;
    private Expression expression;
    private String p;

    public String isPrivateAt() {
        return p;
    }

    public void setPrivateAt(String privateAt) {
        this.p = privateAt;
    }

    public Attribute(@Token("name") String name, @Before("=") Expression expression) {
        this.name = name;
        this.expression = expression;
    }

    public Attribute(String privateAt, @Token("name") String name, @Before("=") Expression expression) {
        this.name = name;
        this.expression = expression;
        this.p=privateAt;
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
