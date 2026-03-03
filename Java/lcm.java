public class lcm
{
    public static void main(String args[])
    {
        int a=4;
        int b=6;
        int lcm=0;
        for(int i=(a>b?a:b);i<=a*b;i++)
        {
            if(i%a==0 && i%b==0)
            {
                lcm=i;
                break;
            }
        }
        System.out.println("LCM="+lcm);
    }
}
