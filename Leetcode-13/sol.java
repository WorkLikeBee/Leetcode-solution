import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> symbol = new HashMap<>();
        symbol.put('I', 1);
        symbol.put('V', 5);
        symbol.put('X', 10);
        symbol.put('L', 50);
        symbol.put('C', 100);
        symbol.put('D', 500);
        symbol.put('M', 1000);
        int ret = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int val = symbol.get(c);
            char prev = (i > 0) ? s.charAt(i - 1) : ' ';

            switch (c) {
                case 'V':
                case 'X':
                    if (prev == 'I') { ret += val - 1; i--; }
                    else ret += val;
                    break;
                case 'L':
                case 'C':
                    if (prev == 'X') { ret += val - 10; i--; }
                    else ret += val;
                    break;
                case 'D':
                case 'M':
                    if (prev == 'C') { ret += val - 100; i--; }
                    else ret += val;
                    break;
                default:
                    ret += val;
            }
        }
        return ret;
    }
}