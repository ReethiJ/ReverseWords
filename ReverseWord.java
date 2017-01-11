import java.util.*;
import java.io.*;
public class ReverseWords {
    public static String reverseWords(String inputString) {
         String[] words = inputString.split(" ");
         
            StringBuffer reverseString =new StringBuffer();// "";
            if(words.length==1) 
            return inputString.trim();
            int n=words.length,i;
            for(i=n - 1; i >= 0; i--){
                if(words[i] != null && !words[i].isEmpty())
                    reverseString=reverseString.append(words[i]).append(" ");
             }
            String s= reverseString.toString();
            s=s.trim();
            return s;
    }
    public static void Main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Please enter a string");
        String s=in.nextLine();
        String rev=reverseWords(s);
        System.out.println(rev);
    }
}
