class Solution {
    public int findMin(int[] nums) {
        // Check if the array only contains 1 element.
        if (nums.length == 1){
            return nums[0];
        }

        // Create a counter to find the last index of the first region.
        int k = 0;
        while(k+1 < nums.length && nums[k]<nums[k+1] ){
            k++;
        }

        // If the counter is the same with the last index of the entire array -> return the first element of the array.
        if (k == nums.length -1){
            return nums[0];
        }
        // Otherwise return the element at (k+1)th index.
        else{
            return nums[k+1];
        }
    }
}
