class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer,Integer> hs=new HashMap<>();
        HashSet<Integer> hashSet=new HashSet<>();

        for(int i=0;i<arr.length;i++)
        {
            

            hs.put(arr[i], hs.getOrDefault(arr[i], 0)+1);
        }

        Object keys[]=hs.keySet().toArray();
        

        for(int i=0;i<hs.size();i++)
        {
            if(hashSet.contains(hs.get(keys[i])))
                return false;
        
            hashSet.add(hs.get(keys[i]));

        }

        return true;

    }
}