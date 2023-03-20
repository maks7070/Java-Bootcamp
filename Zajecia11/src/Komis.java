import java.util.ArrayList;

public class Komis
{
    private ArrayList<Car> samochody;


    public Komis()
    {
        samochody = new ArrayList<>();
        addObjects();

    }

    //1 Napisz funkcje ktora doda 10 obiektow do waszej arraylisty


    public void addObjects()
    {
        Car c = new Car("Toyota",120,"Corolla");
        for(int i  = 0; i < 10;i++)
        {
            samochody.add(c);
        }
    }

    //2 napisz getter do arraylisty



    public ArrayList<Car> getSamochody()
    {
        return samochody;
    }


    //3 punkt wyswietl wszystkie obiekty w klasie main, tej ktora ma psvm
}
