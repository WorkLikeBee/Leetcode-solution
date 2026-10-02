class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        s2 = ''.join([char for char in s if char.isalnum()])
        s2 = s2.lower()
        pointer1 = 0
        pointer2 = len(s2)-1
        while pointer1<len(s2)/2:
            if s2[pointer1] != s2[pointer2]:
                return False
            pointer1+=1
            pointer2-=1

        return True
