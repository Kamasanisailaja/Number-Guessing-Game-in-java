//number guessing game

import java.util.Scanner;
public class Number_Guessing_Game
{
    public static void main(String args[])
    {
        int guess,i,n=5;
        Scanner in = new Scanner(System.in);
        int secret = 1+(int)(100*Math.random());
        System.out.println("Enter a number b/n 1 to 100");
        System.out.println("You will be given 5 chances to guess");
        for(i=0;i<n;i++)
        {
            System.out.print("Enter a number:");
            guess = in.nextInt();
            if(guess==secret)
            {
                System.out.println("Congrats..! You won the game");
                break;
            }
            else if((secret<guess)&&i!=n-1)
            System.out.println("The number is less than "+guess);
            else if((secret>guess)&&i!=n-1)
            System.out.println("The number is greater than "+guess);
        }
        if(i==n)
        {
            System.out.println("YOU HAVE REACHED MAXIMUM LIMIT");
            System.out.println("The number is "+secret);
        }
    }    
}
