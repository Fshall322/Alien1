/**
 * Created by Frank Hall on 6/25/2016.
 */
public class Planet
{
    private String name;
    private double temp;
    private int size;

    public Planet(String n, double t, int s)
    {
        name = n;
        temp = t;
        size = s;
    }

    public void setName(String n)
    {
        name = n;
    }

    public void setTemp(double t)
    {
        temp = t;
    }

    public void setSize(int s)
    {
        size = s;
    }

    public String getInfo()
    {
        String str = "planet name: " +name+ "\nTemperature: " +temp+ "\nSize: " +size;
        return str;
    }
}
