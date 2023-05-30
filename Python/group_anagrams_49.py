from collections import defaultdict
from typing import List


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # solution 1
        # ans = defaultdict(list)

        # for s in strs:
        #     count = [0] * 26
        #     for c in s:
        #         count[ord(c) - ord("a")] += 1
        #     ans[tuple(count)].append(s)

        # return ans.values()

        # solution 2
        ans = defaultdict(list)

        for s in strs:
            sorted_s = ''.join(sorted(s))
            ans[sorted_s].append(s)

        return ans.values()


if __name__ == "__main__":
    strs = ["eat", "tea", "tan", "ate", "nat", "bat"]

    solution = Solution().groupAnagrams(strs)
    print(solution)
