//define of enum Liquid properties
public enum Liquid {

    LIQUID_FOR_PALM (0.5, 0, "kranvatten"),
    LIQUID_FOR_CARNIVOROUS (0.2, 0.1, "proteindryck"),
    LIQUID_FOR_CACTUS (1, 0.02, "mineralvatten");



    public final double liquidPerM;
    public final double liquidPerDay;
    public final String typeOfLiquid;

    Liquid(double liquidPerM, double liquidPerDay, String typeOfLiquid) {
        this.liquidPerM = liquidPerM;
        this.liquidPerDay = liquidPerDay;
        this.typeOfLiquid = typeOfLiquid;
    }
}
