public class Solution {
	public String reverseWords(String inputString) {
	    String[] words = inputString.split(" ");
         
        StringBuffer reverseString =new StringBuffer();// "";
        if(words.length==1) return inputString.trim();
         int n=words.length,i;
        for(i=n - 1; i >= 0; i--)
        {

     if(words[i] != null && !words[i].isEmpty())

            reverseString=reverseString.append(words[i]).append(" ");
        }
        String s= reverseString.toString();
       s=s.trim();
        return s;
	}
}
