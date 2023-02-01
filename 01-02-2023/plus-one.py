class Solution:
    def plusOne(self, d: List[int]) -> List[int]:
        n = ""
        for i in d:
            n += str(i)
        n = int(n)+1
        l = []
        for i in str(n):
            l.append(int(i))
        return l
