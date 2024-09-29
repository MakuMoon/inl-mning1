//heritage from Plant and implements the interface IPlant from Plant
public class Cactus extends Plant {

    private Liquid liquidAspects = Liquid.LIQUID_FOR_CACTUS;

    public Cactus(String name, double height) {
        super(name, height);
    }

    @Override
    public double calculateLiquid() {
        return liquidAspects.liquidPerDay;
    }

    @Override
    public String toString() {
        return "Kaktusen " + getName() + " är " + getHeight() + "m hög.\n" +
                getName() + " behöver " + calculateLiquid() + " liter " + liquidAspects.typeOfLiquid + "/dag.";
    }

}
