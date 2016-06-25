/**
 * Created by Frank Hall on 6/25/2016.
 */
public class Alien
{
    private String name;
    private String color;
    private int numOfLegs;
    private boolean isFriendly;
    private Planet origin;

    public Alien(String n, String c, String pName, double temp, int size)
    {
        name = n;
        color = c;
        origin = new Planet(pName, temp, size);
        numOfLegs = 2;
        isFriendly = false;
    }

    public void setNumOfLegs(int le)
    {
        numOfLegs = le;
    }

    public void setPlanet(String name, double temp, int size)
    {
        origin.setName(name);
        origin.setTemp(temp);
        origin.setSize(size);
    }
    public String getInfo()
    {
        String str = "Alien: " +name+ "\nColor: " +color+ "\nNumber of legs: " +numOfLegs+ "\nIs friendly: " +isFriendly+ "\nPlanet inf : \n" +origin.getInfo();
        return str;
    }
}
