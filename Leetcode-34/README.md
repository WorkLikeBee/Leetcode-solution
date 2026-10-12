# Leetcode34
Find  First and Last Position of Element in Array

The solution is based on the concepts of two pointer approach. Here is how it works:
    + First create a method to find the first occurence of the element from the left. 
        + This method will use while loop and a leftPointer starting at the first index 0. 
        + Traverse through the array until the element at the leftPointer index matches with the target
        + The method will return the index (leftPointer).
    + Then, create another method to find the last occurence using the same logic with the previous method. 
        + Create a rightPointer and use while loop to traverse 
        + Traverse through the array until the element at the rightPointer index matches with the target
        + The method will return that index rightPointer.
    + In the main, create an int array called resultArr to store those 2 indexes that are returned from the two methods. Then return that resultArr.
