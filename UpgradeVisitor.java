public class UpgradeVisitor implements LaptopVisitor {
    @Override
    public void visit(CPU cpu) {
        System.out.println("Upgrade CPU: Model " + cpu.getModel() + " (" + cpu.getCores() + " cores). Upgrade impossible");
    }

    @Override
    public void visit(GPU gpu) {
        System.out.println("Upgrade GPU: Model " + gpu.getModel() + " (" + gpu.getVram() + "GB VRAM). Upgrade impossible");
    }

    @Override
    public void visit(Motherboard motherboard) {
        if (motherboard.hasFreeM2Slot()) {
            System.out.println("Motherboard upgrade: Has free M2 slot! You can add new SSD");
        } else {
            System.out.println("Motherboard upgrade: No free slots for M2");
        }
    }
}