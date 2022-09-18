package Hard;

class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        s=set(nums)
        for i in range(1,len(s)+2):
            if(len(s)==1 and nums[0]>0):
                if(nums[0]>1):
                    return 1
                else:
                    return nums[0]+1
            if i not in s:
                return i
