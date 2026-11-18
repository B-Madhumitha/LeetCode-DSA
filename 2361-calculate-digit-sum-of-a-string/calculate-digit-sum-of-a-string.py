class Solution:
    def digitSum(self, s: str, k: int) -> str:
        while len(s) > k:
            n = len(s)
            lista = []
            for i in range(0,n,k):
                value = 0
                for j in range(i, min(i+k,n)):
                    value += int(s[j]) 
                lista.append(str(value))
            s = "".join(lista)
        return s