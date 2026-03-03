import java.util.*;
public class palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        String og=Integer.toString(x);
        String rev="";
        for(int i=og.length()-1;i>=0;i--)
        {
            rev=rev+og.charAt(i);
        }
        if(og.equals(rev))
        {
            System.out.println("Palindrome");
        }
        else
            System.out.println("Not Palindrome");
    }

}
