class Solution(object):
    def getSneakyNumbers(self, nums):
        list1 = { }
        for i in nums:
            if i in list1:
                list1[i] += 1
            else:
                list1[i] = 1
        return sorted([i for i,count in list1.items() if count>1])