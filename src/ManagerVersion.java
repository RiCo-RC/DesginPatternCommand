public class ManagerVersion {

    private int major = 0;
    private int minor = 0;
    private int patch = 0;

    public void updateMajor() {
        this.major += 1;
    }

    public void updateMinor() {
        this.minor += 1;
    }

    public void updatePatch() {
        this.patch += 1;
    }

    public void resetMajor() {
        this.major = 0;
    }

    public void resetMinor() {
        this.minor = 0;
    }

    public void resetPatch() {
        this.patch = 0;
    }

    @Override
    public String toString() {
        return this.major + "." + this.minor + "." + this.patch;
    }
}
