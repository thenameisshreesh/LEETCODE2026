class Solution {
    
    public int findTheWinner(int n, int k) {

        if(n==1)
            return 1;

        int arr[]=new int[n],i=0,count=0,zero=0;

        Arrays.fill(arr, 1);


        while(i<arr.length)
        {

            

            if(arr[i]!=0)
            {
                count++;
                
               
            }

            if(count==k)
            {
                arr[i]=0;
                zero++;
                if(zero==arr.length-1)
                    break;
                count=0;
            }

            
        
            i=(i+1)%arr.length;

        }

        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]!=0)
                return j+1;
        }
        
        return 0;

    }


}