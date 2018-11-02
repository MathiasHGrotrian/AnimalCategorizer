public class Animal extends AnimalComponent
{
    private String animalName;

    public Animal(String animalName)
    {
        this.animalName = animalName;
    }

    @Override
    public String getAnimalName()
    {
        return animalName;
    }

    public void displayAnimalInformation()
    {
        System.out.println("Animal name: " + getAnimalName());
    }
}
