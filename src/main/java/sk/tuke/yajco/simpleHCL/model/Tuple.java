package sk.tuke.yajco.simpleHCL.model;

import yajco.annotation.*;

import java.util.List;

public class Tuple extends CollectionValue {

    private List<LiteralValue> items;

    public Tuple(@Before("[") @After("]") @Separator(",") List<LiteralValue> items) {
        this.items = items;
    }

    public List<LiteralValue> getItems() {
        return items;
    }

    public void setItems(List<LiteralValue> items) {
        this.items = items;
    }
}