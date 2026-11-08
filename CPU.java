public class CPU implements LaptopComponent {
    private String model;
    private double temperature;
    private int cores;

    public CPU(String model, double temperature, int cores) {
        this.model = model;
        this.temperature = temperature;
        this.cores = cores;
    }

    public String getModel() { return model; }
    public double getTemperature() { return temperature; }
    public int getCores() { return cores; }

    @Override
    public void accept(LaptopVisitor visitor) {
        visitor.visit(this);
    }
}