import java.io.*;
import java.util.*;

 class StringToword {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
       // s=s.trim(); 
        if(s.length()==0)
        {
        System.out.println(0);
        }
        else
        {
    String arr[]=s.split("[!,?._'@ ]+");
    System.out.println(arr.length);
    
      for(String w:arr)
     System.out.println(w);
        }
        
    }
}

