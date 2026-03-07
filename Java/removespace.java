public class removespace
{
    public static void main(String args[])
    {
        String s="Java is easy";
        for(int i=0;i<s.length();i++)
            if(s.charAt(i)!=' ')
                System.out.print(s.charAt(i));
    }
}
