import java.util.*;
class task_02
{
    static int n, i, j, k, l;
    static Scanner sc=new Scanner(System.in);
    static void rat(int n)
    {
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }
    }
    static void pyr(int n)
    {
        for(i=1;i<=n;i++)
        {
            for(j=i;j<=n;j++)
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++)
            {
                System.out.print(k+"");
            }   
            for(l=(i-1);l>=1;l--)
            {
                System.out.print(l+"");
            }
            System.out.print("\n");
        }
    }
    static void dmd(int n)
    {
        for(i=1;i<=n;i++) 
        {
            for(j=i;j<=n;j++) 
            {
                System.out.print(" ");
            }
            for(j=1;j<=(2*i-1);j++) 
            {
                System.out.print(j);
            }
            System.out.println();
        }
        for(i=(n-1);i>=1;i--) 
        {
            for(j=n;j>=i;j--) 
            {
                System.out.print(" ");
            }
            for(j=1;j<=(2*i-1);j++) 
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        System.out.println("***PATTERN GENERATOR***");
        int choice=0;
        while(choice!=5)
        {
            System.out.println("1. Right Angled Triangle.");
            System.out.println("2. Pyramid.");
            System.out.println("3. Diamond");
            System.out.println("4. Quit.");
            while(true)
            {
                System.out.print("Enter your choice= ");
                choice= sc.nextInt(); 
                switch(choice)
                {
                    case 1:
                        {
                            System.out.print("Enter the range= ");
                            n= sc.nextInt();
                            rat(n);
                            System.exit(0);
                            break;
                        }
                    case 2:
                        {
                            System.out.print("Enter the range= ");
                            n= sc.nextInt();
                            pyr(n);
                            System.exit(0);
                            break;
                        }
                    case 3:
                        {
                            System.out.print("Enter the range= ");
                            n= sc.nextInt();
                            dmd(n);
                            System.exit(0);
                            break;
                        }
                    case 4:
                        {
                            System.out.println("Quiting...");
                            System.exit(0);
                            break;
                        }
                    default:
                        {
                            System.out.println("Invalid input...");
                            System.out.println("Please enter a valid input...");
                        }
                }
            }
        }
    }
}