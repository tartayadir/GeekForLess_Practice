package Task2.anchors;

public class StaffHost extends Anchor{
    //GuestHost
    private int workExperience;

    public StaffHost(String name, int workExperience) {
        super(name);
        this.workExperience = workExperience;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    @Override
    public String toString() {
        return "StaffHost{" +
                "name=" + getName() +
                "workExperience=" + workExperience +
                '}';
    }
}
