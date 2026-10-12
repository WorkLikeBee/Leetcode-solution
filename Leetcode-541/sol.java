class Solution {
    public String reverseStr(String s, int k) {
        String result = "";
        if (s.length() < k){
            for(int i = s.length()-1; i>=0; --i){
                result += s.charAt(i);
            }
        }
        else{
            for(int i = 0; i<s.length(); i+=k){
                int j = i+k-1;
                if((i/k) % 2 == 0){
                    if(j<s.length()-1){
                        for(j = i+k-1; j>=i; --j){
                            result += s.charAt(j) +"";
                        }
                    }
                    else{
                        for(j= s.length()-1;j>=i;--j){
                            result+=s.charAt(j) +"";
                        }
                    }
                }
                else{
                    if(j<s.length()-1){
                        for(j= i; j<=i+k-1; ++j){
                            result += s.charAt(j) +"";
                        }
                    }
                    else{
                        for(j= i; j<=s.length()-1; ++j){
                            result+=s.charAt(j) + "";
                        }
                    }
                }
            }
        }
        return result;
    }
}
