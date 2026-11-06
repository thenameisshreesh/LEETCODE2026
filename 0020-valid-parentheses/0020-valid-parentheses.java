class Solution {
   public boolean isValid(String s) {
    
        Stack<Character> ans=new Stack<>(); 
        
        char check;

        for (char c:s.toCharArray()) {
            
            if(c=='(' || c=='{' || c=='[')
                ans.add(c);
            else
            {

                if(c == ']' || c=='}' || c==')')
                {


                    if(ans.isEmpty())
                        return false;;

                    check=ans.peek();

                    if(c == ']' && check == '[')
                        ans.pop();
                    else if(c == ')' && check == '(')
                        ans.pop();
                    else if(c == '}' && check == '{')
                        ans.pop();
                    else
                        return false;




                }


            }


        }

        if(ans.isEmpty())
            return true;
        else
            return false;
        
    }


}