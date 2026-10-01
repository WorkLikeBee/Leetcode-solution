class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] resultArr = {findFirstOccurence(nums,target), findLastOccurence(nums,target)};
        return resultArr;
    }

    // Create a method to find the first occurence of the element from the left.
    public int findFirstOccurence(int[] nums, int target){
        int leftPointer = 0;
        while(leftPointer<nums.length){
            if(nums[leftPointer] == target){
                return leftPointer;
            }
            leftPointer++;
        }
        return -1;
    }

    //Create a method to find the last occurence of the element from the left. (the first occurence from the right).
    public int findLastOccurence(int[] nums, int target){
        int rightPointer = nums.length -1;
        while(rightPointer>=0){
            if(nums[rightPointer] == target){
                return rightPointer;
            }
            rightPointer--;
        }
        return -1;
    }
}
