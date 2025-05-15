import java.util.Scanner;

public class Main  
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        
        int n=sc.nextInt();
        switch(n)
        {
            case 1:
                System.out.println(n+" is Sunday");
                break;
            case 2:
                System.out.println(n+" is Monday");
                break;
            case 3:
                System.out.println(n+" is Tuesday");
                break;
            case 4:
                System.out.println(n+" is Wednesday");
                break;
            case 5:
                System.out.println(n+" is Thursday");
                break;
            case 6:
                System.out.println(n+" is Friday");
                break;
            case 7:
                System.out.println(n+" is Saturday");
                break;
            default:
            System.out.print("Invalid Number");
            break;
        }
        sc.close();
        
    }
}
