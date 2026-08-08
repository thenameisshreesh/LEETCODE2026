import java.math.BigInteger;

class Solution {
    
    public int[] plusOne(int[] digits) {
        
        int dig=0,lastDig=digits[digits.length-1];
        String tmp;

        ArrayList<Integer> a=new ArrayList<>();

        if(lastDig+1>=10 && digits.length==1)
        {
            return new int[]{1,0};

        }else if(lastDig+1>=10)
        {
            
            StringBuilder sb = new StringBuilder();

            for (int d : digits) {
                sb.append(d);
            }

            BigInteger num=new BigInteger(sb.toString());

            num=num.add(BigInteger.ONE);

            tmp=num.toString();
            
            int ans[]=new int[tmp.length()];

            for(int i=0;i<tmp.length();i++)
            {
                ans[i]=Integer.parseInt(""+tmp.charAt(i));

            }

            return ans;
            
        }
        else
        {

            digits[digits.length-1]++;

        }

        return digits;
        
    }
    
}