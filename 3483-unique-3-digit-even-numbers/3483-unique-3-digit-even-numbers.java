class Solution {
    public int totalNumbers(int[] digits) {
        
        HashSet<Integer> hs=new HashSet<>();
        
        HashSet<Integer> ans=new HashSet<>();

        int num=100;
        
        for(int i=0;i<digits.length;i++)
        {
            for(int j=0;j<digits.length;j++)
            {
                for(int k=0;k<digits.length;k++)
                {
                    if(i!=j && j!=k && i!=k && digits[i]!=0)
                    {
                        num*=digits[i];
                        num+=digits[j]*10;
                        num+=digits[k];

                        if(num%2==0)
                            ans.add(num);

                    }

                    hs.clear();
                    num=100;
                }
            }
        }

        return ans.size();


    }
}