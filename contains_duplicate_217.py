from typing import List


class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        # solution 1
        # return len(nums) != len(set(nums))

        # solution 2
        hashset = set()

        for i in nums:
            if i in hashset:
                return True
            hashset.add(i)
        return False


if __name__ == "__main__":
    nums = [1, 2, 3, 1]

    solution = Solution()
    result = solution.containsDuplicate(nums)
    print(result)
