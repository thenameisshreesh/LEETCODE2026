class Solution {
    
    public List<Integer> generateRow(int rn)
    {
        List<Integer> row =new ArrayList<>();
        int ans=1;

        row.add(1);
        for(int i=1;i<rn; i++)
        {
            ans=ans*(rn-i);
            ans=ans/(i);
            row.add(ans);
        }

        return row;

    }

    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> rowMatrix=new ArrayList<>();


        for(int i=1;i<=numRows;i++)
        {
            rowMatrix.add(generateRow(i));
        }

        return rowMatrix;


    }
}