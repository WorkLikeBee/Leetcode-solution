class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pointer1 = 0;
        int pointer2 = 0;
        int countItem = 0;
        int[] nums1Item = new int[m];
        for (int i = 0; i < m; ++i){
            nums1Item[i] = nums1[i];
        }
        while(pointer1 < m && pointer2 < n){
            if (nums1Item[pointer1] <= nums2[pointer2]){
                nums1[countItem] = nums1Item[pointer1];
                pointer1++;
            }
            else{
                nums1[countItem] = nums2[pointer2];
                pointer2++;
            }
            countItem++;
        }
        if(pointer2 >= n){
            for(int i = pointer1; i<m; ++i){
                nums1[countItem] = nums1Item[i];
                countItem++;
            }
        }
        else{
            for(int i = pointer2; i<n; ++i){
                nums1[countItem] = nums2[i];
                countItem++;
            }
        }
    }
}
