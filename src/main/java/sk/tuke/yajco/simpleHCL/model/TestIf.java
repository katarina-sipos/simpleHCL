package sk.tuke.yajco.simpleHCL.model;

import yajco.annotation.After;

public class TestIf extends ExprTerm{

    private ExprTerm condition;
    private ExprTerm body;

    //@After("pp")
    public TestIf(ExprTerm condition, @After("pp") ExprTerm body) {
        this.condition = condition;
        this.body = body;
    }

    public ExprTerm getCondition() {
        return condition;
    }

    public void setCondition(ExprTerm condition) {
        this.condition = condition;
    }

    public ExprTerm getBody() {
        return body;
    }

    public void setBody(ExprTerm body) {
        this.body = body;
    }
}
