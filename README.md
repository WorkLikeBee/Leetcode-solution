# LeetCode70
How many ways to climb the stairs ?

When I did this problem manually, I realized the pattern to solve this problem.
Step 1: 1 way 
Step 2: 2 ways
Step 3: 3 ways
Step 4: 5 ways
Step 5: 8 ways

Step n: Ways of step (n-1) + Ways of step (n-2)

This is actually familiar with Fibonacci problem but instead of building the method by using recursion, I will build it fromm the ground since recursion takes exponential-rate time to run (which is too long).

Firstly, if n step <= 2, return that n values since step 1 has 1 way and step 2 has 2 ways, which is the number itself.
Then create a value x represent the # of way for (n-1) and initialized it to step 1 => x = 1 initially
Then create a value y represent the # of ways for n and initialized it to step 2 => y = 2 initially

This is how the logic works. For example, I'll take 4 for the number of stairs. 
I use the for loop start at 3 to 4. In the first loop, i=3 means the step 3. Create a temporary variable to store x+y = 3, move x up to y and y = the temporary value
So after first loop, x= 2 and y=3 
Then the second loop, also the final loop, i=4. Create a temporary variable to store x+y = 5, move x to y and y = temp val
So the final loop, x=3, y=5

The final y value is the number of ways to climb the stairs
So return y as the final answer.
