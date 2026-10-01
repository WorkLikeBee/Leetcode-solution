# Leetcode217
Is the nums array contains duplicate items?

This solution is based on the idea of mapping. 
So, at first, I created a map that the key-value pairs type are Integer, Integer. 
Then I traverse through the array and check if the map contains the element or not. If there is no key representing for the element then put that element into the map as a key entry associated with a value of 1 (occurrence). Otherwise, return true because the key of that element already exists in the map, which shows that element is duplicated.

If the for loop is executed til the end point, return false since all the elements in the array are unique number.
