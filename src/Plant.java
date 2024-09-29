//Implementing the interface IPlant
public class Plant implements IPlant {

    //here is an example of encapsulation where the variables are private and can only be accessed through the getters
    //it is used to protect the data from being modified and accesed by other classes
    private String name;
    private double height;

    public Plant(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double calculateLiquid() {
        return -1;
    }

    @Override
    public String toString() {
        return "Plantan är inte definierad.";
    }

}
