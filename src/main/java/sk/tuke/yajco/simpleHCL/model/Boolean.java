package sk.tuke.yajco.simpleHCL.model;

import yajco.annotation.Exclude;
import yajco.annotation.Token;


public class Boolean extends LiteralValue {
    private boolean value;

    public Boolean(@Token("bool") boolean value) {
        this.value = value;
    }

    public boolean getValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }
}
