package Task2.anchors;

public abstract class Anchor {

    private String name;

    public Anchor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

