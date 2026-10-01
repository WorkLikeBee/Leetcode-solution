class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """

        opening_bracket = ['(', '[', '{']
        arr = []
        s_to_ls = list(s)

        i=0
        while(i < len(s_to_ls)):
            if(s_to_ls[i] in opening_bracket):
                arr.append((s_to_ls[i]))
            else:
                if (s_to_ls[i] == ')'):
                    if arr and arr[-1] == '(':
                        arr.pop(-1)
                    else: 
                        return False
                
                if (s_to_ls[i] == ']'):
                    if arr and arr[-1] == '[':
                        arr.pop(-1)
                    else: 
                        return False
                    
                if (s_to_ls[i] == '}'):
                    if arr and arr[-1] == '{':
                        arr.pop(-1)
                    else: 
                        return False
            i+=1

        if not arr:
            return True
        else:
            return False
        