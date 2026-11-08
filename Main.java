public class Main {
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop();

        LaptopVisitor diagnostics = new DiagnosticsVisitor();
        LaptopVisitor upgradeChecker = new UpgradeVisitor();

        System.out.println("Diagnosis start");
        myLaptop.accept(diagnostics);

        System.out.println("\nPossible upgrades check");
        myLaptop.accept(upgradeChecker);
    }
}