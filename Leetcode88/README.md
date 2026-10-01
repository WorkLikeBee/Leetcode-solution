# Leetcode88
Merge Sorted Array
In this solution, first I create an array, called nums1Item, to store the elements to merge in array nums1. The purpose is to make a shorter version of nums1 to traverse more easily. Then, I create two pointers (pointer 1 and 2), and use them for each of the arrays. 
I use an example to explain my logic behind the code: 
nums1 = [1, 2, 3, 0, 0, 0], m= 3, nums2 = [2, 5, 6], n=3

=> create nums1Item = [1, 2, 3]
Use while loop to traverse through the arrays. The condition is when the pointer1 < m (the length of the nums1Item) and the pointer2 <n (the length of the nums2)
variable countItem = 0 for nums1 array. (the first position in nums1 array)
             |                       |
             v                       v
nums1Item = [1, 2, 3]       nums2 = [2, 5, 6] 
1 < 2 => nums1 = [1, _, _, _, _, _]. Then pointer1 moves to the next item, counItem move to the next position.
2 = 2 => mums1 = [1, 2, _, _, _, _]. Then pointer 1 moves to the next item, countItem move to the next position. 
So on and so forth until one of the pointer is out of range. 
In this particular example, the pointer 1 will move out of range first. So the nums1 becomes: nums1 =[1, 2, 2, 3, _, _]
<=> Every items in nums1Item have been passed to the num1 array while the nums2 still have 2 items to be passed into the nums1. 
So simply, I just create an if-else branches to deal with the cases. The first case is the pointer2 out of range (>=n) and the second one is the pointer1 is out of range(>=m)
If the pointer 2 is out of range then add all the items left in nums1Item into nums1
Otherwise, add all the items left in nums2 into nums1. 
