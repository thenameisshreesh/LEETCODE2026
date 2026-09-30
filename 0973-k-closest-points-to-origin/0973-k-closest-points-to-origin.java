class Solution {
    public int[][] kClosest(int[][] points, int k) {
     
        int i=0;

        int ans[][]=new int[k][2];

        PriorityQueue<int[]> p=new PriorityQueue<>((a,b)->(b[0]*b[0]+b[1]*b[1])-(a[0]*a[0]+a[1]*a[1]));



        while (i<points.length) {

            p.add(new int[]{points[i][0],points[i][1]});

            i++;
            
        }

        while (p.size()>k) {

            p.poll();

            
            
        }

        i=0;

        int arr[]=new int[2];

        while (i<k) {
            
            arr=p.poll();

            ans[i][0]=arr[0];
            ans[i][1]=arr[1];


            i++;

        }


        return ans;


    }
}