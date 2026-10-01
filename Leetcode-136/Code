class Solution {
    public int singleNumber(int[] nums) {

        int pointer = 0;
        while(pointer < nums.length){
            int countItem = 2;
            for (int i = 0; i<nums.length; ++i){
                if (nums[i] == nums[pointer]){
                    countItem--;
                }
            }
            if(countItem != 0){
                return nums[pointer];
            }
            pointer++;
        }
        return 0;
    }
}
