public class changecase
{
    public static void main(String args[])
    {
        String s="HeLLo";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isUpperCase(c))
                System.out.print(Character.toLowerCase(c));
            else
                System.out.print(Character.toUpperCase(c));
        }
    }
}
