import java.util.Scanner;

public class AnimalCategorizer
{
    public static void main(String[] args)
    {

        AnimalComponent everyAnimal = new AnimalFamily("All species", "Every animal in system");

        Zoologist peter = new Zoologist(everyAnimal);

        peter.getAnimalList();

        Boolean isRunning = true;

        while(isRunning)
        {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Welcome. Manage animals:");
            System.out.println("1. Create Animal Family");
            System.out.println("2. Create single Animal");

            String menuOption = scanner.nextLine();

            switch(menuOption)
            {
                case "1":
                {
                    System.out.println("Enter Family name:");
                    String familyName = scanner.nextLine();

                    System.out.println("Enter family Description");
                    String familyDescription = scanner.nextLine();

                    System.out.println(familyName);
                    System.out.println(familyDescription);
                }

                case "2":
                {
                    break;
                }

                default:
                {
                    System.out.println("Unknown");
                }
            }

        }

    }
}
