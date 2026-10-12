# Leetcode412
FizzBuzz problem

In this problem, there is a logic for FizzBuzz return:
answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.

So first, I create a method with a parameter of inputVal to contain the logic. The method will return the String based on the inputVal. 
Then simply, I create an array that has the length of n. Then, iterated the array using for-loop to define element for the array. 
Since the array store the num element counting from 1, I use the counter starting from 1 instead of 0 as usually so that I can define the element at the counter position is also the counter itself and use the method of logic to return the String representing that num element.
