import java.util.*;
public class Reversestring {
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
         String word=s.nextLine();
         StringBuffer b=new StringBuffer(word);
         b.reverse();
         System.out.println(b);
        String c=new String(b).replaceAll("[a,e,i,o,u]", "");
        System.out.println(c);
       
           
          
}
}      
