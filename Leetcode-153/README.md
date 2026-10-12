# Leetcode153
Finding minimum in rotated Sorted array

In this problem, there are actually 2 general cases:
      + First case is the original sorted array is rotated
      + Second case is the original sorted array is not rotated. And for this case, there are 2 subcases:
              - The array only contains 1 element
              - The rotated array is the original array.

Here is a breakdown of my code:
     + Firstly, I detect if the array only contains an element => Simply, return that element cause that is the lowest value of the array.
     + After that, if the array is rotated then there will be 2 regions - for ex, [3,4,1,2] can be divided into [3,4] and [1,2]. Otherwise, the array is literally the original arrays.
           + And as you can see, if the array is rotated, the first element of the 2nd region is always the smallest element of the array.
           + If the array is the original array, then the first element of the array is the smallest element.
     + To check which case the problem is in, I create a counter k and use while loop to find the last index of the first region. 
           ----> If k is the same with the last index of the entire array. It means the array is the original array. ---> Return the element of the first index.
           ----> Otherwise, return the element at (k+1)th index. 
            
