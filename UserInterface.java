import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {

    private Scanner scanner;
    private BirdDatabase birds;

    public UserInterface(BirdDatabase birds, Scanner scanner) {
        this.scanner = scanner;
        this.birds = birds;
    }

    public void start() {
        while (true) {
            System.out.println("?");
            String command = scanner.nextLine();

            if (command.equals("Quit")) {
                break;
            }

            if (command.equals("Add")) {
                System.out.println("Name:");
                String name = scanner.nextLine();
                System.out.println("Name in Latin: ");
                String latin = scanner.nextLine();

                birds.add(new Bird(name, latin));
            }

            if (command.equals("Observation")) {
                System.out.println("Bird?");
                String bird = scanner.nextLine();

                if (birds.observation(bird) == false) {
                    System.out.println("Not a bird!");
                }
            }

            if (command.equals("All")) {
                birds.printAll();
            }

            if (command.equals("One")) {
                System.out.println("Bird?");
                String bird = scanner.nextLine();

                if (birds.printOne(bird) == null) {
                    System.out.println("Not a bird!");
                }
                System.out.println(birds.printOne(bird));
            }
        }
    }

}
