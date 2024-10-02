import java.util.List;
import java.lang.Math;

public class Palindrome_Number
{
    public static void main(String[] args)
    {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
        // System.out.println(toArray(123));
        // toArray(123);
    }
 
    public static boolean isPalindrome(int x) {
        int[] xArray = toArray(x);
        int[] xArrayReversed = new int[xArray.length];
        int result = 0;

        int index = 0;
        for(int i = xArray.length - 1; i >= 0; i--)
        {
            xArrayReversed[index] = xArray[i];
            index++;
        }

        for(int i = 0; i < xArrayReversed.length; i++)
        {
            result = result * 10 + xArrayReversed[i];
        }
        System.out.println(result);
        System.out.println(x);

        if(x != result)
        {
            return false;
        }else
        {
            return true;            
        }
    }

    public static int[] toArray(int x)
    {
        String xString = "" + x;
        char[] xStringArray = xString.toCharArray();
        int[] xIntArray = new int[xStringArray.length];
        // System.out.println(xStringArray.length);
        for(int i = xStringArray.length - 1; i >= 0 ; i--)
        {
            int num = xStringArray[(i)];
            int result = num - '0';
            // System.out.println(result);
            xIntArray[i] = result;
            System.out.println(xIntArray[i]);    
        }
        // System.out.println(Integer.toInt(xIntArray));
        return xIntArray;
        // for (Char i : xStringArray)
        // {
        //     xIntArray[i] = 
        // }
    }
}