# Leetcode11
Container with most water (Array)

The idea of this solution is based on the two pointers concepts in Array. Here is how it works: 
      + First, initialize the maxArea equals to 0;
      + Traverse through the Array by using while loop (the condition is until the two pointers encounter each other) and calculate the area bounded by:
                + The distance between the rightPointer and leftPointer
                + The lower height value 
                    --> For ex: if height[rightPointer] = 2 and height[leftPointer] = 1; right pointer is 3 and left pointer is 1;
                                => Area = lowerHeight * distance = 1 * (3-1) = 2
      + If the height at the leftPointer is lower than the rightPointer's, then move the leftPointer to the next index (increased by 1. Otherwise, move the rightPointer to the next index (decreased by 1)
      + Update the maxArea if the maxArea is smaller than the computed area.
      After the while loop is complete, return the udated maxArea. 
