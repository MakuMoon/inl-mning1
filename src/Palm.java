//heritage from Plant and implements the interface IPlant from Plant
public class Palm extends Plant {

    // private variable of type Liquid, to be able to get all the properties for the
    // specific plant
    private Liquid liquidAspects = Liquid.LIQUID_FOR_PALM;

    public Palm(String name, double height) {
        super(name, height);
    }

    @Override
    public double calculateLiquid() {
        return getHeight() * liquidAspects.liquidPerM;
    }

    @Override
    public String toString() {
        return "Palmen " + getName() + " är " + getHeight() + "m hög.\n" +
                getName() + " behöver " + calculateLiquid() + " liter " + liquidAspects.typeOfLiquid + "/dag.";
    }

}
