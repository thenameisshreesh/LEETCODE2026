class Solution {
   public boolean isValid(String s) {
        
        Stack<Character> st=new Stack<>();

        if(s.toCharArray().length<=1)
            return false;

        char [] carr=s.toCharArray();

        if(carr[0]==']' || carr[0]=='}' || carr[0]==')')
            return false;


        for (char c: s.toCharArray()) {
            
            

            

            if(c=='{' || c=='[' || c=='(')
            {

                st.add(c);


            }

            if((c==']' || c=='}' || c==')') && st.empty())
            {

                return false;


            }
            
          
            
            if(c=='}')
            {

                if(st.peek()=='{')
                {
                    st.pop();
                }else
                    return false;
                    
            }else if(c==']')
            {

                if(st.peek()=='[')
                {
                    st.pop();
                }else
                    return false; 
                
                
            }else if(c==')')
            {

                if(st.peek()=='(')
                {
                    st.pop();
                }else
                    return false;   
            }
            else
                continue;

            

        }

        if(st.empty())
            return true;
        else
            return false;
    }


}