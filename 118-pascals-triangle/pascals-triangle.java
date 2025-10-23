class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();

        if(numRows <= 0) return pascalTriangle;

        for(int i = 0; i < numRows; i++){
            List<Integer> sub = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    sub.add(1);
                }

                else{
                    int val = pascalTriangle.get(i-1).get(j-1) + pascalTriangle.get(i-1).get(j);
                    sub.add(val);
                }
            }
            pascalTriangle.add(sub);
        }
        return pascalTriangle;
    }
}