
//repo: https://github.com/MakuMoon/inl-mning1
//updated version of the previous assignment from feedback - added list of plants to remove hardcoding
import java.util.Scanner;

public class Greenest {

    // Creating the plants with the interface IPlant and using polymorphism to
    // create the objects
    private IPlant plantIgge = new Cactus("Igge", 0.2);
    private IPlant plantLaura = new Palm("Laura", 5);
    private IPlant plantMeatloaf = new Carnivorous("Meatloaf", 0.7);
    private IPlant plantOlof = new Palm("Olof", 1);
    private IPlant[] plants = { plantIgge, plantLaura, plantMeatloaf, plantOlof };

    private Scanner scanner = new Scanner(System.in);

    public Greenest() {
        System.out.println("\033[H\033[2J");
        while (true) {
            start();
        }
    }

    public static void main(String[] args) {
        Greenest greenest = new Greenest();
    }

    public void start() {

        boolean foundPlant = false;
        String plant = dialogGetPlant();

        System.out.print("\033[H\033[2J");

        if (!plant.isEmpty()) {
            plant = plant.substring(0, 1).toUpperCase() + plant.substring(1).toLowerCase().trim();
        }


        for (IPlant p : plants) {
            if (p.getName().equals(plant)) {
                System.out.println(p.toString());
                foundPlant = true;
                break;
            }

            else if (plant.equals("Exit")) {
                System.exit(0);
            }
        }
        if (foundPlant == false) {
            System.out.println("Växten finns inte.");
            
        }

        System.out.println("\nPress enter to continue...");
        scanner.nextLine();
        System.out.println("\033[H\033[2J");
    }

    private String dialogGetPlant() {
        System.out.print("(");
        for (IPlant p : plants) {
            System.out.print(p.getName());
            if (p != plants[plants.length - 1]) {
                System.out.print(", ");

            }
        }
        System.out.println(")");
        System.out.print("Vilken växt ska få vätska: ");
        return scanner.nextLine();
    }

}
