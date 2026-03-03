public class armstrong
{
    public static void main(String args[])
    {
        int n = 153;
        int temp = n;
        int sum = 0;

        for (int i = n; i > 0; i = i / 10) {
            int d = i % 10;
            sum = sum + d*d*d;
        }

        if (sum == temp)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}
