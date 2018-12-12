package Eclipse.Calculator;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	System.out.println("1 = + , 2 = - , 3 = / , 4 = *");
        Scanner mark = new Scanner (System.in);
        System.out.println("put mark");
        int s= mark.nextInt();
        
        
        
       Scanner  in = new Scanner (System.in);
       System.out.println("first number");
       int num1 = in.nextInt();

       System.out.println("second number");

       int num2 = in.nextInt();

        if ( s == 1 )
        {
            System.out.println(num1 + num2);
            
        } else if (s == 2) {
            System.out.println(num1 - num2);




        } else if (s == 3){
            System.out.println(num1 / num2);

            } else if (s == 4)
            System.out.println(num1 * num2);
         else { System.out.println("put right number");{
        }








 }
 }

        }