public class decimaltobinary
{
    public static void main(String args[])
    {
        int n = 10;

        for(int i=n;i>0;i=i/2)
        {
            System.out.print(i % 2);
        }
    }
}
