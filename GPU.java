public class GPU implements LaptopComponent {
    private String model;
    private double temperature;
    private int vram;

    public GPU(String model, double temperature, int vram) {
        this.model = model;
        this.temperature = temperature;
        this.vram = vram;
    }

    public String getModel() { return model; }
    public double getTemperature() { return temperature; }
    public int getVram() { return vram; }

    @Override
    public void accept(LaptopVisitor visitor) {
        visitor.visit(this);
    }
}