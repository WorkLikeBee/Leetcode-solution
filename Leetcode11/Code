class Solution {
    public int maxArea(int[] height) {
        int rightPointer = height.length -1;
        int leftPointer = 0;
        int maxArea = 0;
        while (leftPointer != rightPointer){
            int area;
            if (height[leftPointer] < height[rightPointer]){
                area = (rightPointer - leftPointer) * height[leftPointer];
                leftPointer++;
            }
            else{
                area = (rightPointer-leftPointer) * height[rightPointer];
                rightPointer--;
            }
            if(maxArea<area){
                maxArea = area;
            }
        }
        return maxArea;
    }
}
