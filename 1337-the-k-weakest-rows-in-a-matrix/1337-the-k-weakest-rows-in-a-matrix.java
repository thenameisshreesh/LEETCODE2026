class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        
        int l=0,r=mat[0].length-1,mid=0,i=0;

        PriorityQueue<int []> qs=new PriorityQueue<>(
           (a, b) -> {
                if (a[0] != b[0])
                    return Integer.compare(b[0], a[0]);

                return Integer.compare(b[1], a[1]);
            }
        );

        
        while (i<mat.length) {
            
            l=0;
            r=mat[i].length-1;
            while (l<=r) {


                mid=l+(r-l)/2;
                
                if(mat[i][mid]==1)
                    l=mid+1;
                else
                    r=mid-1;


            }

            qs.add(new int[]{l,i});

            if (qs.size() > k) {
                qs.poll();
            }



            i++;
        }

        int ans[]=new int[k];


        for(int j=k-1;j>=0;j--)
        {

            ans[j]=qs.poll()[1];

        }


        return ans;
    }
}