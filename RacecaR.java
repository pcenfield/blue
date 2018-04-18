

/**
 * Checks if the inputted String is a valid palindrome
 * 
 * @author Parker Enfield
 * @version 4/13/2018
 */
public class RacecaR
{

    public static boolean RacecaR(String input)
    {
        if (input.length()<=1)//base case when we reached the string's center
        {
            return true;
        }
        else if (input.charAt(0) == input.charAt(input.length()-1))//checks if front and back char are equivelent
        {
            return RacecaR(input.substring(1,input.length()-1));//returns a two char smaller string each time
        }
        else
            return false;
    }


}
