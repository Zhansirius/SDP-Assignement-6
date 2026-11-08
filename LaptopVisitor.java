public interface LaptopVisitor {
    void visit(CPU cpu);
    void visit(GPU gpu);
    void visit(Motherboard motherboard);
}
