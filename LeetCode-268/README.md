# LeetCode268
Return the number that is not in the array

In my first trial, I create an ArrayList that stores the all values in the nums array. The reason is that I want to use the contains() method to check if the value isn't in the list then return that number. Sound simple but I has a very bad time complexity compared to another code that I have. 

The code in fixedCode is based on the logic of math. If I have a sum of every number in the range from [0, n]. Then I subtract every val in nums array. Since the array is missing a number, after subtracting done, eventually I will have the sum is that missing number. Then I just simply return that sum, which is also the missing number.

Since the second code is somewhat hard to understand but it takes less time to execute since I just need to use only 1 for-loop, take O(n) time.
