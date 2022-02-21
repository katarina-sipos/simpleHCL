package sk.tuke.yajco.simpleHCL.model;

public class Body {
    private Attributes attributes;

    public Body(Attributes attributes) {
        this.attributes = attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public Attributes getAttributes() {
        return attributes;
    }
}