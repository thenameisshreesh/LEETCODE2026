class Solution {
    public String frequencySort(String s) {

        HashMap<Character,Integer> fq=new HashMap<>();

        HashMap<Integer,List<Character>> oppo=new HashMap<>();
        
        char crr[];

        StringBuffer sb=new StringBuffer();
        int max=0,var=0,feq=0;

        int arr[];

        for (char c:s.toCharArray()) {

            fq.put(c, fq.getOrDefault(c, 0)+1);
            
        }

        for (char ch : fq.keySet()) {

            feq = fq.get(ch);

            if (!oppo.containsKey(feq)) {
                oppo.put(feq, new ArrayList<>());
            }

            oppo.get(feq).add(ch);
        }

        

        List<Integer> v=new ArrayList<>(oppo.keySet());
        v.sort(Comparator.reverseOrder());

        for (int i = 0; i < v.size(); i++) {
            for (char ch : oppo.get(v.get(i))) {
                for (int j = 0; j < v.get(i); j++) {
                    sb.append(ch);
                }
            }
        }

        return sb.toString();
    }
}