//Arjun Vasudevan
import java.util.*;
public class Richter
{
    public static void main(String[] args)
    {
        System.out.print("Enter a magnitude on the Richter scale ==>> ");
        Scanner in = new Scanner(System.in);
        double input = in.nextDouble();
        if(input<0)
        {
            System.out.println("\nThis number is not valid.");
        }
        if(input>=8.0)
        {
            System.out.println("\nDamage = Most structures fall");
        }
        else if(input>=7.0)
        {
            System.out.println("\nDamage = Most buildings destroyed");
        }
        else if(input>=6.0)
        {
            System.out.println("\nDamage = Many buildings considerably damaged; some collapse");
        }
        else if(input>=4.5)
        {
            System.out.println("\nDamage = Damage to poorly constructed buildings");
        }
        else if(input>=3.5)
        {
            System.out.println("\nDamage = Felt by many people, no destruction");
        }
        else if(input>=0.0)
        {
            System.out.println("\nDamage = Generally not felt by people");
        }

        
    }
}