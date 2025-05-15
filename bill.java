import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of units:");
        int n=sc.nextInt();
        int amount=0;
        if(n>0 && n<=50)
        {
            amount=n*3;
        }
        else if(n>50 && n<=150)
        {
            amount=150+((n-50)*5);
        }
        else if(n>150 && n<=250)
        {
            amount=650+((n-150)*7);
        }
        else
        {
            System.out.println("Electricity service charge of 50 is also included,So...");
            amount=1400+((n-250)*10);
        }
        System.out.println("The Electricity bill:"+amount);
        sc.close();
    }
}
