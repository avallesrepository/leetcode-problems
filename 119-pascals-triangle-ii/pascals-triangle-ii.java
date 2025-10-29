class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> output = new ArrayList<>();
        output.add(1);
        for(int i = 1; i <= rowIndex; i++){
            for(int j = i - 1; j > 0; j--){
                output.set(j, output.get(j) + output.get(j-1));
            }
            output.add(1);
        }
        return output;
    }
}