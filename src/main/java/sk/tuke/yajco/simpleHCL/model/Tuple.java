package sk.tuke.yajco.simpleHCL.model;

import yajco.annotation.*;

import java.util.List;

@Parentheses(left="{", right = "}")
public class Tuple extends CollectionValue {

    private List<LiteralValue> items;

    public Tuple(List<LiteralValue> items) {
        this.items = items;
    }

    public List<LiteralValue> getItems() {
        return items;
    }

    public void setItems(List<LiteralValue> items) {
        this.items = items;
    }
}
