public class UpdateMajorCommand implements ICommand {

    private ManagerVersion managerVersion;

    public UpdateMajorCommand(ManagerVersion managerVersion) {
        this.managerVersion = managerVersion;
    }

    @Override
    public void execute() {
        this.managerVersion.updateMajor();
        this.managerVersion.resetMinor();
        this.managerVersion.resetPatch();
    }
}