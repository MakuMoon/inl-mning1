//heritage from Plant and implements the interface IPlant from Plant
public class Carnivorous extends Plant {

    private Liquid liquidAspects = Liquid.LIQUID_FOR_CARNIVOROUS;

    public Carnivorous(String name, double height) {
        super(name, height);
    }

    @Override
    public double calculateLiquid() {
        return (getHeight() * liquidAspects.liquidPerM) + liquidAspects.liquidPerDay;
    }

    @Override
    public String toString() {
        return "Köttätande växten " + getName() + " är " + getHeight() + "m hög.\n" +
                getName() + " behöver " + calculateLiquid() + " liter " + liquidAspects.typeOfLiquid + "/dag.";
    }

}
