class Solution {
    public List<String> fizzBuzz(int n) {
        String[] answer = new String[n];
        for (int i=1; i<=n; ++i){
            answer[i-1] = element(i);
        }
        return Arrays.asList(answer);
    }
    public String element(int inputVal){
        if (inputVal%3 ==0 && inputVal%5 == 0){
            return "FizzBuzz";
        }
        if(inputVal%3 == 0){
            return "Fizz";
        }
        if(inputVal%5 == 0){
            return "Buzz";
        }
        else{
            return Integer.toString(inputVal);
        }
    } 
}
