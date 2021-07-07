import java.util.*;
class ReverseString
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence");
        String inputstring = sc.nextLine();
        String[] words = inputstring.split("\\s");
        String outputstring = "";
        
        
        for(int i=words.length-1;i>=0;i--)
        {
            outputstring = outputstring + words[i] + " ";
        }
        
        
        System.out.print(outputstring);
    }
}
        
        
        