

/**
 * Write a description of class Fundraiser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fundraiser
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class Fundraiser
     */
    public Fundraiser()
    {
        // initialise instance variables
        x = 0;
    }

    public static int badcollect(int monataryGoal)
    {
        int dudes;
        System.out.println(monataryGoal);
        if (monataryGoal <= 1)//base case
            return 1;
        else
        {
            dudes = badcollect(monataryGoal/10);
            int p = 1;
            for (int i=0; i<Integer.toString(monataryGoal).length()-1; i++) 
            {
                 p*=10;
            }
            return dudes + p;
        }
    }

    public static double collect(double monataryGoal)
    {
        double temp=0;
        if (monataryGoal <= 1)//base case
            return 1;
        else
        {
            for (int i=0; i<10; i++) 
            {
                 temp+=collect(Math.ceil(monataryGoal/10.0));
            }
            return temp+1;
        }
    }

}
