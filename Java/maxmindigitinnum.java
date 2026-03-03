public class maxmindigitinnum
{
    public static void main(String args[])
    {
        int n=2745, max=0, min=9;
        for(int i=n;i>0;i=i/10)
        {
            int d=i%10;
            if(d>max)
            {
                max=d;
            }
            if(d<min)
            {
                min=d;
            }
        }
        System.out.println("Max="+max+" "+"Min="+min);
    }
}
