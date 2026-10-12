class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        ret = 0
        symbol = {
            "I": 1,
            "V": 5,
            "X": 10,
            "L": 50,
            "C": 100,
            "D": 500,
            "M": 1000
        }
        i  = len(s)-1
        while (i>=0):
            if (s[i] == "V" or s[i] == "X"):
                if (i-1 >= 0 and s[i-1] == "I"):
                    ret += symbol[s[i]] - 1
                    i-=1
                else:
                    ret += symbol[s[i]]
            elif (s[i]=="L" or s[i] == "C"):
                if (i-1 >= 0 and s[i-1] == "X"):
                    ret += symbol[s[i]] - 10
                    i-=1
                else:
                    ret += symbol[s[i]]
            elif (s[i]=="D" or s[i] == "M"):
                if (i-1 >= 0 and s[i-1] == "C"):
                    ret += symbol[s[i]] - 100
                    i-=1
                else:
                    ret += symbol[s[i]]
            else:
                ret += symbol[s[i]]
            i-=1

        return ret        
        