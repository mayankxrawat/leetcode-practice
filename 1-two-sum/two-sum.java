class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap<Integer,Integer> result = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int comp = target - nums[i];
            if(result.containsKey(comp)){
                return new int[]{result.get(comp),i };
            }
            result.put(nums[i],i);
            }
        
        return new int []{};  
    }
}