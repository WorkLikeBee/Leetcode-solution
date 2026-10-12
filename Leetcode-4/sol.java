class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[]mergedArr = new int[nums1.length + nums2.length];
        for(int i=0;i<nums1.length;++i){
            mergedArr[i] = nums1[i];
        }
        for(int i =nums1.length; i<nums1.length+nums2.length; ++i){
            mergedArr[i] = nums2[i-nums1.length];
        }
        Arrays.sort(mergedArr);
        if(mergedArr.length %2 == 0){
            double result = ((double) mergedArr[(mergedArr.length-1)/2 +1] + (double) mergedArr[(mergedArr.length-1)/2])/2;
            return result;
        }
        else{
            return (double) mergedArr[(mergedArr.length-1)/2];
        }
    }
}
