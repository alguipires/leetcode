from typing import List


class Solution:
    def two_sum_hashmap(self, nums: List[int], target: int) -> List[int]:
        hashmap_complemento = []
        for i, num in enumerate(nums):
            if hashmap_complemento.get(num) is not None:
                return [hashmap_complemento.get(num), i]
            hashmap_complemento[target - num] = i

    def two_sum_while(self, nums: List[int], target: int) -> List[int]:

        i = 0
        j = len(nums) - 1
        nums.sort()

        while i < j:
            if nums[i] + nums[j] == target:
                return [i + 1, j + 1]
            if nums[i] + nums[j] > target:
                j -= 1
            else:
                i += 1

        return []


if __name__ == '__main__':
    solution = Solution()
    ret_aux = solution.two_sum_hashmap([11, 15, 2, 7], 9)
    print(ret_aux)

    # ret_aux = solution.two_sum_while([11, 15, 2, 7], 9)
    # ret_aux = solution.two_sum_while([2,3,4], 6)
    # print(ret_aux)
