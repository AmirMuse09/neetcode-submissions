class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> checkDuplicate = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            if(!checkDuplicate.add(nums[i])){
                return true;

            }
        }


    return false;
    }
    
}