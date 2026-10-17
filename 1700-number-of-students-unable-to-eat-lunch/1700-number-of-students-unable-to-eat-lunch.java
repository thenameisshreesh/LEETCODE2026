class Solution {
   public int countStudents(int[] students, int[] sandwiches) {

        Queue<Integer> q=new LinkedList<>();
        
        for (int i:students) {
            
            q.add(i);

        }

        int ele=0,rot=0;

        while (!q.isEmpty() && rot<q.size()) {

            if(!(rot<q.size()))
                break;
            
            if(q.peek()==sandwiches[ele])
            {

                
                q.poll();
                ele++;

                rot=0;

            }
            else
            {

                q.add(q.poll());
                rot++;

            }


        }

        return q.size();

    }
}