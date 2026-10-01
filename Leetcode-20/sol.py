class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """

        stack = []
        bracket_pairs = {
            ')':'(',
            ']':'[',
            '}':'{'
        }

        if len(s)%2 != 0:
            return False

        for ch in s:
            if ch in bracket_pairs:
                if not stack or stack.pop() != bracket_pairs[ch]:
                    return False
            else:
                stack.append(ch)
        if not stack:
            return True
        else:
            return False 
        