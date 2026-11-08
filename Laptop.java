import java.util.ArrayList;
import java.util.List;

public class Laptop {
    private List<LaptopComponent> components = new ArrayList<>();

    public Laptop() {
        components.add(new CPU("Intel Core i7-13700H", 92.5, 14));
        components.add(new GPU("NVIDIA RTX 4060 Mobile", 70.0, 8));
        components.add(new Motherboard("Mobile Proprietary", true));
    }

    public void accept(LaptopVisitor visitor) {
        for (LaptopComponent component : components) {
            component.accept(visitor);
        }
    }
}