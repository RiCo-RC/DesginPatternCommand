public class UpdateMinorCommand implements ICommand {

    private ManagerVersion managerVersion;

    public UpdateMinorCommand(ManagerVersion managerVersion) {
        this.managerVersion = managerVersion;
    }

    @Override
    public void execute() {
        this.managerVersion.updateMinor();
        this.managerVersion.resetPatch();
    }
}