package sk.tuke.yajco.simpleHCL.model;


import yajco.annotation.Separator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Attributes extends ArrayList<Attribute>{
    public static Attributes of(Attribute attribute) {
        return new Attributes(Collections.singletonList(attribute));
    }

    public Attributes(List<Attribute> attributes) {
        addAll(attributes);
    }

    public List<Attribute> getAttributes() {
        return this;
    }
}
