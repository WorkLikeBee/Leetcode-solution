class Solution {
    public int findPeakElement(int[] nums) {
        int max = nums[0];
        for(int num : nums){
            if (max<num){
                max = num;
            }
        }

        for (int i =0; i< nums.length;++i){
            if(max == nums[i]){
                return i;
            }
        }
        return 0;
    }
}
