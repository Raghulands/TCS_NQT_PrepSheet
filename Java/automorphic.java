public class automorphic
{
    public static void main(String args[])
    {
        int n=25;
        int sq=n*n;
        if(sq%100 == n)
        {
            System.out.println("Automorphic");

        }
        else
            System.out.println("Not Automorphic");
    }
}
