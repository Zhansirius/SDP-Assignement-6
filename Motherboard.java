public class Motherboard implements LaptopComponent {
    private String formFactor;
    private boolean hasFreeM2Slot;

    public Motherboard(String formFactor, boolean hasFreeM2Slot) {
        this.formFactor = formFactor;
        this.hasFreeM2Slot = hasFreeM2Slot;
    }

    public String getFormFactor() { return formFactor; }
    public boolean hasFreeM2Slot() { return hasFreeM2Slot; }

    @Override
    public void accept(LaptopVisitor visitor) {
        visitor.visit(this);
    }
}