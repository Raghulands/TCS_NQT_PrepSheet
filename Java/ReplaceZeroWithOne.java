public class ReplaceZeroWithOne
{
    public static void main(String args[])
    {
        int n = 10204;
        String s = String.valueOf(n);
        for(int i=0;i<s.length();i++)
        {
            char d = s.charAt(i);
            if(d=='0')
                System.out.print(1);
            else
                System.out.print(d);
        }
    }
}
