# Leetcode4
Find median of two sorted Arrays

The solution is according to the logic that finding the middle item of merged array of nums1 and nums2 int array.
To do that, I first create an int mergedArr having a length of nums1.length and nums2.length. 
Then I added the elements from nums1 array to the merged array by using the for loop. Also do the same thing to add elements from the nums2 array to the merged array.
So I will have my merged array storing all elements from nums 1 and nusm2. Then simply I just need to sort that array by using Arrays.sort() method.

Then depend on the length of the merged array to return the median value. Actually there are 2 specific cases. 
First case is the merged Array has the even length, for ex: 4 [1,2,3,4]. So there will be 2 numbers at the middle which are 2 and 3. So I have to retrieve that second index element and the third index element, then find the avarage and return that val. (I found the result in the Code)

The second case is for the odd length, for ex: 3 [1,2,3]. Then simply we just need to return the middle number, which is 2 by calling mergedArr[(mergedArr.length-1)/2]
