package Task2.anchors;

import java.io.File;

public class GuestHost extends Anchor{

    private File cv;

    public GuestHost(String name, File cv) {
        super(name);
        this.cv = cv;
    }

    public File getCv() {
        return cv;
    }

    public void setCv(File cv) {
        this.cv = cv;
    }

    @Override
    public String toString() {
        return "GuestHost{" +
                "name=" + getName() +
                "cv=" + cv +
                '}';
    }
}
