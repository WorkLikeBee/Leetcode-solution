# LeetCode231
Power of 2 (true or false)

This solution is simply based on the logic of math.
First, we will have a case when the input is negative number. Return false since the power of 2 is always a positive number no matter what the exponent is. 

After that, we devide that number by 2 repeatedly until it is not greater than 1. Then we will check if the number is smaller than 1 or if the number has decimal place. For ex, 0.75, then the input val is not the power of 2. Else, return true.
