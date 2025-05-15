import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        
        double discriminant=b*b-(4*a*c);
        
        if(discriminant>0)
        {
            double root1=(-b+ Math.sqrt(discriminant)) /(2*a);
            double root2=(-b- Math.sqrt(discriminant)) /(2*a);
            System.out.println("Two roots are "+root1+ " and "+root2);
        }
        else if(discriminant==0)
        {
            double root=-b/(2*a);
            System.out.println("One of the equal root is "+root);
        }
        else{
            System.out.println("No real roots");
        }
        sc.close();
        
    }
}
