package sk.tuke.yajco.simpleHCL.model;

import yajco.annotation.*;

import java.util.List;

public class Tuple extends CollectionValue {

    private List<Expression> items;

    public Tuple(@Before("[") @After("]") @Separator(",") List<Expression> items) {
        this.items = items;
    }

    public List<Expression> getItems() {
        return items;
    }

    public void setItems(List<Expression> items) {
        this.items = items;
    }
}