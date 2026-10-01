# Leetcode541
Reverse the first k characters for every 2k characters counting from the start of the string

First, create an empty string called result

If I have a string "abcdefg", and k = 2
Then I create regions which have 2 items for each of them by using for-loop: for(int i = 0; i<s.length(); i+=k){...} . So:
   ab cd ef g 
i= 0  2  4  6

Then I check if i/k is an even number.
    + If so, adding backward the characters in that region into string result by using another for-loop to iterate through the region with the index starts at i+k-1 to i (but carefully check if the index i+k-1 is out of bound or not since if i =6 then the index i+k-1 is 7, which is out of bound. If it is out of bound then the for-loop will starts from the last index, s.length()-1, to i).
    + else, adding forward the characters in the region into result also using for-loop but starts at i to i+k-1 ( also carefully check if i+k-1 is out of bound or not, if so starts at i to s.length()-1).
    

Then, return the result as the final string. 
