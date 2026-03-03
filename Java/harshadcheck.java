public class harshadcheck
{
    public static void main(String args[])
    {
        int n=18, sum=0;
        for(int i=n;i>0;i=i/10)
        {
            sum=sum+i%10;

        }
        if(n%sum==0)
        {
            System.out.println("Harshad");
        }
        else
            System.out.println("Not");
    }
}
