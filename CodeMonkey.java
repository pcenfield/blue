

/**
 * Write a description of class CodeMonkey here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CodeMonkey
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class CodeMonkey
     */
    public CodeMonkey()
    {
        x=0;
    }
    
    public static void Countdown(int n)
    {
        if (n<=-1)
            return;// 0;
        else
        {
            System.out.print(n+" ");
            Countdown(n-1);
        }
    }
    
    public static void Countup(int n)
    {   
        if (n<=-1)
            return;
        else
        {
            Countup(n-1);
            System.out.print(n+" ");
        }
    }
    
    public static boolean Primetime(double p, double n)
    {
        if (n<=2)
            return true;
        else 
        {
            if (p%(n-1)  == 0)
                return false;
            return Primetime(p, n-1);
        }
            
    }
    
//test

}
