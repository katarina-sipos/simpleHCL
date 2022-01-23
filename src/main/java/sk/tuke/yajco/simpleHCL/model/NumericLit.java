package sk.tuke.yajco.simpleHCL.model;

import yajco.annotation.Token;

public class NumericLit extends LiteralValue{
    private Integer value;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public NumericLit(@Token("number") Integer value) {
        this.value = value;
    }
}
