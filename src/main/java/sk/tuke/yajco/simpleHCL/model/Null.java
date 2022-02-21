package sk.tuke.yajco.simpleHCL.model;

import yajco.annotation.Token;

public class Null extends LiteralValue{
    private String nullValue;

    public String getNullValue() {
        return nullValue;
    }

    public void setNullValue(String nullValue) {
        this.nullValue = nullValue;
    }

    public Null(@Token("null_value") String nullValue) {
        this.nullValue = nullValue;
    }
}