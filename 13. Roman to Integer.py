class Solution:
    def romanToInt(self, s: str) -> int:
        roman_map = {
            'I': 1,
            'V': 5,
            'X': 10,
            'L': 50,
            'C': 100,
            'D': 500,
            'M': 1000
        }

        result = 0

        for i in range(len(s)):
            if i< len(s) - 1 and roman_map[s[i]] < roman_map[s[i+1]]:
                result -= roman_map[s[i]]
            else :
                result += roman_map[s[i]]
        
        return result
