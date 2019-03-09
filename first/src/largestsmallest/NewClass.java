/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largestsmallest;

/**
 *
 * @author akanksha singh
 */
public class NewClass {
   public static void largsetsmallest(int []a)
    {
            int largest=Integer.MIN_VALUE;
            int smallest=Integer.MAX_VALUE;
            for(int number:a )
            { if (number>largest)
            {
                largest=number;
            }
            }
            System.out.println("larest element "+largest);
                
        for(int number:a)
        {
            if(number<smallest)
            {
                smallest=number;
            }
        }
    System.out.println("smallest element "+smallest);
    }
}
public static void main(String [] args)-
{

}
    
    
