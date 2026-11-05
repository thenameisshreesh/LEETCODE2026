class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    

        int r=0,c=0;

        int ls=0,rs=0,mid=0;

        int ur=0,lr=matrix.length-1,midr=0;

        

        while(ur <= lr ){
            
            midr=ur+(lr-ur)/2;

            if(matrix[midr][0]<=target && matrix[midr][matrix[midr].length-1]>=target)
            { 
            

                ls=0;
                rs=matrix[midr].length-1;

                while (ls<=rs) {
                    
                    mid=ls+(rs-ls)/2;

                    if(target>matrix[midr][mid])
                        ls=mid+1;
                    else if(target<matrix[midr][mid])
                        rs=mid-1;
                    else
                        return true;


                }

                return false;


            }else if(target>matrix[midr][matrix[midr].length-1])
                ur=midr+1;
            else
                lr=midr-1;

        }

        return false;
    }
}