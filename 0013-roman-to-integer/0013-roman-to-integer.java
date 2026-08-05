class Solution {
    public int romanToInt(String s) {
        
        Map<Character,Integer> hs=new HashMap<>(Map.of('I',1,'V',5,'X',10,'L',50,'C',100,'D',500,'M',1000));

        char c;
        int val=0,got1=0,j=1,got2=0,i=0;

        for( i=0;j<s.length();i++,j++)
        {

            got1=hs.get(s.charAt(i));
            got2=hs.get(s.charAt(j));

            if(got1<got2)
            {
                val-=got1;

            }else
                val+=got1;


        }

        
        val+=hs.get(s.charAt(i));

        return val;


    }
}