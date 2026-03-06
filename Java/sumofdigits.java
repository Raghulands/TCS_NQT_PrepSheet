public class sumofdigits
{
    public static void main(String args[])
    {
        int n = 1234;
        int sum = 0;
        for(int i=n;i>0;i=i/10)
        {
            sum =sum+i%10;
        }
        System.out.println(sum);
    }
}
