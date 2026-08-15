class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        HashSet<Character> hs=new HashSet<>();

        int r=0;

        for (char c : jewels.toCharArray()) {
            hs.add(c);
        }

        for (char c:stones.toCharArray()) {
            
            if(hs.contains(c))
                r++;

        }

        return r;

    }
}