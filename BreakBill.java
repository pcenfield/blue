

/**
 * Returns all possible dollar bill combinations using recursion to make the parameter
 * 
 * @author Parker Enfield
 * @version 4/16/2018
 */
public class BreakBill
{


    /**
     * Default constructor for objects of class BreakBill
     */
    public static int BreakBill(int total)
    {
        int temp = 0;
        int oneB = 0; 
        int fiveB = 0;
        int twenB = 0;
        int hundB = 0;
        
        
        oneB = total % 5 ;
        temp = total-oneB;
        fiveB = temp / 5;
        
        System.out.println("$1:"+oneB+" - $5:"+fiveB+" - $20:"+twenB+" - $100:"+hundB);
        
        return total;
    }


}
