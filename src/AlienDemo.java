/**
 * Created by Frank Hall on 6/25/2016.
 */
public class AlienDemo
{
    public static void main(String[] args)
    {
        Planet neptune = new Planet("Neptune", -218, 2300);
        System.out.println(neptune.getInfo());
        Alien joe =  new Alien("Joe", "ornage", "Mars", -156, 1500);
        System.out.println(joe.getInfo());
    }
}
