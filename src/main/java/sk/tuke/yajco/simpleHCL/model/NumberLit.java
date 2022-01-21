package sk.tuke.yajco.simpleHCL.model;

import yajco.annotation.Token;

public class NumberLit extends LiteralValue{
    private Integer value;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public NumberLit(@Token("number") Integer value) {
        this.value = value;
    }
}
