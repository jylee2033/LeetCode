from typing import List


class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # solution 1
        # prevMap = {}  # val -> index

        # for i, n in enumerate(nums):
        #     diff = target - n
        #     if diff in prevMap:
        #         return [prevMap[diff], i]
        #     prevMap[n] = i

        # solution 2
        # for index, value in enumerate(nums):  # [2, 5, 5, 11]
        #     for i, v in enumerate(nums[index+1:]):  # [5, 5, 11]
        #         if value + v == target:
        #             return [index, index + 1 + i]

        # solution 3
        for i in range(len(nums) - 1):
            for j in range(i + 1, len(nums)):
                if nums[i] + nums[j] == target:
                    return [i, j]


if __name__ == "__main__":
    nums = [2, 5, 5, 11]
    target = 10

    solution = Solution().twoSum(nums, target)
    print(solution)
