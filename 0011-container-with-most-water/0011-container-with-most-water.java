class Solution {
    public int maxArea(int[] height) {
     
        int lt=0,rt=height.length-1,ans=Integer.MIN_VALUE;

        int w,h,area;

        while (lt<rt) {
            
            h=Math.min(height[lt],height[rt]);

            w=rt-lt;

            area=w*h;

            ans=Math.max(ans, area);

            if(height[lt]<height[rt])
                lt++;
            else
                rt--;

        }


        return ans;


    }
}