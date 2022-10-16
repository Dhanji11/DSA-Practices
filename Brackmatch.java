import java.util.*;
public class Brackmatch
{
    public static void main(String args[])
    {
        String str="{[)]";
        System.out.println(isboolean(str));
        
    }
    static boolean isboolean(String str)
    {
        Stack<Character> stk=new Stack<>();
        for(char c:str.toCharArray())
        {
            if(isOpening(c))
            {
                stk.push(c);
            }
            else
            {
                if(stk.isEmpty())
                    return false;
                else if(c=='}' && stk.peek()!='{')
                    return false;
                else if(c==']' && stk.peek()!='[')
                    return false;
                else if(c==')' && stk.peek()!='(')
                return false;
                
                
                stk.pop();
            }
        }
         return stk.isEmpty();
    }
  static boolean isOpening(char c)
    {
        // if(c=='[' || c=='{' || c=='(')
        return  (c=='[' || c=='{' || c=='(');
           
    }
   
}