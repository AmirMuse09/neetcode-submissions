class Solution {
    public static boolean hasDuplicate(int[] nums) {
            Set<Integer> seen = new HashSet<>();
            for (int num : nums ){
                if (seen.contains(num)){
                    return true;
                }
                seen.add(num);
                }
        return false;
    }
}
