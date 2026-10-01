class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet <Integer> set = new HashSet<>();
        for (int num : nums){
            set.add(num);
        }
        int numCheck = 1;
        while(true){
            if(!set.contains(numCheck)){
                return numCheck;
            }
            numCheck++;
        }
    }
}
