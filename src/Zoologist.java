import java.util.Scanner;

public class Zoologist
{
    AnimalComponent animalList;

    public Zoologist(AnimalComponent animalList)
    {
        this.animalList = animalList;
    }

    public void getAnimalList()
    {
        animalList.displayAnimalInformation();
    }

}
