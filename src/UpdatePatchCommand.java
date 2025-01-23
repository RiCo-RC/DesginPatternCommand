public class UpdatePatchCommand implements ICommand {

    private ManagerVersion managerVersion;

    public UpdatePatchCommand(ManagerVersion managerVersion) {
        this.managerVersion = managerVersion;
    }

    @Override
    public void execute() {
        this.managerVersion.updatePatch();
    }
}
