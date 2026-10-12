# Leetcode41
Finding the smallest missing positive integer in the array

The solution is based on the idea of using HashSet to check if the set is contained the number which is going from 1 to infinity. 
Here is how it works:
      + Create a HashSet and add every items from the nums array to the set
      + Create a num checker running from 1. And check if the set contains the num checker or not:
            + If the set doesn't contains the num checker then return that num checker.
            + Otherwise, increase the num checker by 1 and do the contain-checking again (while looping).

