public class Car
{
    private String marka;
    private int predkoscMax;

    private String nazwa;


    //Konstruktor



    //Gettery i settery


    public Car(String marka, int predkoscMax, String nazwa) {
        this.marka = marka;
        this.predkoscMax = predkoscMax;
        this.nazwa = nazwa;
    }


    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getPredkoscMax() {
        return predkoscMax;
    }

    public void setPredkoscMax(int predkoscMax) {
        this.predkoscMax = predkoscMax;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
