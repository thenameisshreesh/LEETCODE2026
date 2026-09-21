class Solution {
    public int countNegatives(int[][] grid) {
            

        int i=0,l=0,r=grid[0].length-1,mid=0,count=0;

        while(i<grid.length)
        {

            l=0;
            r=grid[i].length-1;

            while (l<=r) {
                
                mid=l+(r-l)/2;

                if(grid[i][mid]>=0)
                    l=mid+1;
                else
                    r=mid-1;



            }

            count+=grid[i].length-l;



            i++;


        }

        return count;


    }
}