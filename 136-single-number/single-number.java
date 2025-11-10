class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> hashMap = new HashMap<>();

        for(int num : nums){
            hashMap.put(num, hashMap.getOrDefault(num, 0)+ 1);
        }

        for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return -1;
    }
}