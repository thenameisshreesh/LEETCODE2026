class Solution {
    public int maxArea(int[] height) {
        
        int l=0,r=height.length-1,w=0,h=0,area=0,ma=0;

        while (l!=r) {
            
            w=r-l;
            h=Math.min(height[r],height[l]);

            area=w*h;

            if(h==height[l])
                l++;
            else
                r--;

            if(area>ma)
                ma=area;
        }


        return ma;

    }
}