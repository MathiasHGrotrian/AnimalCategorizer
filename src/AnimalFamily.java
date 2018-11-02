import java.util.ArrayList;
import java.util.Iterator;

public class AnimalFamily extends AnimalComponent
{
    private ArrayList animalComponents = new ArrayList();

    private String familyName;
    private String familyDescription;

    public AnimalFamily(String familyName, String familyDescription)
    {
        this.familyName = familyName;
        this.familyDescription = familyDescription;
    }

    public String getFamilyName()
    {
        return familyName;
    }

    public String getFamilyDescription()
    {
        return familyDescription;
    }

    //  Get specific Component by index
    public AnimalComponent getAnimalComponent(int index)
    {
        return (AnimalComponent)animalComponents.get(index);
    }

    public void add(AnimalComponent newAnimalComponent)
    {
        animalComponents.add(newAnimalComponent);
    }

    public void remove(AnimalComponent newAnimalComponent)
    {
        animalComponents.add(newAnimalComponent);
    }

    public void displayAnimalInformation()
    {
        System.out.println(getFamilyName() + " " +
                getFamilyDescription() + "\n");

        Iterator animalIterator = animalComponents.iterator();

        while(animalIterator.hasNext())
        {
            AnimalComponent animalInformation = (AnimalComponent) animalIterator.next();
            animalInformation.displayAnimalInformation();
        }
    }


}
