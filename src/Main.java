public class Main {
    public static void main(String[] args) {
        ManagerVersion managerVersion = new ManagerVersion();

        ICommand updateMajor = new UpdateMajorCommand(managerVersion);
        ICommand updateMinor = new UpdateMinorCommand(managerVersion);
        ICommand updatePatch = new UpdatePatchCommand(managerVersion);

        RemoteManagerVersion manager = new RemoteManagerVersion();
        manager.addCommand("updateMajor", updateMajor);
        manager.addCommand("updateMinor", updateMinor);
        manager.addCommand("updatePatch", updatePatch);

        System.out.println("-----1-----");
        System.out.println(managerVersion.toString());

        System.out.println("-----2-----");
        managerVersion.updatePatch();
        System.out.println(managerVersion.toString());

        System.out.println("-----3-----");
        updatePatch.execute();
        System.out.println(managerVersion.toString());

        System.out.println("-----4-----");
        manager.execute("updateMajor");
        System.out.println(managerVersion.toString());

        System.out.println("-----5-----");
        manager.execute("updateMinor");
        System.out.println(managerVersion.toString());

        System.out.println("-----6-----");
        manager.execute("updatePatch");
        System.out.println(managerVersion.toString());

        System.out.println("-----7-----");
        manager.execute("updatePatch");
        System.out.println(managerVersion.toString());

        System.out.println("-----8-----");
        manager.execute("updateMajor");
        System.out.println(managerVersion.toString());

        System.out.println("-----9-----");
        manager.execute("updatePatch");
        System.out.println(managerVersion.toString());

        System.out.println("-----10-----");
        manager.execute("updateMinor");
        System.out.println(managerVersion.toString());

    }
}