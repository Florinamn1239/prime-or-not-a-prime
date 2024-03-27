import java.util.Scanner;
class PrimeNo
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int i;
        for(i=2; i<=n; i++)
        {
            if(n%i==0)
            {
                break;
            }
        }
        if(n==1|| i==n)
        {
            System.out.println("Number is a prime number");
        }
        else
        {
            System.out.println("Number is not a prime number");
        }
    }
}
