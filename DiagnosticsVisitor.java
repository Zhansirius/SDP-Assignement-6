public class DiagnosticsVisitor implements LaptopVisitor {
    @Override
    public void visit(CPU cpu) {
        if (cpu.getTemperature() > 85.0) {
            System.out.println("WARNING: CPU " + cpu.getModel() + " Overheating! Temperature: " + cpu.getTemperature() + "°C");
        } else {
            System.out.println("CPU " + cpu.getModel() + " functions normally");
        }
    }

    @Override
    public void visit(GPU gpu) {
        if (gpu.getTemperature() > 80.0) {
            System.out.println("WARNING: GPU " + gpu.getModel() + " Overheating! Temperature: " + gpu.getTemperature() + "°C");
        } else {
            System.out.println("GPU " + gpu.getModel() + " functions normally");
        }
    }

    @Override
    public void visit(Motherboard motherboard) {
        System.out.println("Motherboard (" + motherboard.getFormFactor() + "): Diagnosis finished");
    }
}