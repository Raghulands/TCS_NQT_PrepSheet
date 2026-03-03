import java.util.*;
public class primecheck
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int x=sc.nextInt();
        for(int i=1;i<=x;i++)
        {
            if(x%i==0)
                count++;
        }
        if(count==2)
        {
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }

    }
}
