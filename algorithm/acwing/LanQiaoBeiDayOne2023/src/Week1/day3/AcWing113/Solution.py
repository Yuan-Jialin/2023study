#author: 袁佳林
class Solution(object):
    def specialSort(self, N):
        """
        :type N: int
        :rtype: List[int]
        """
        res = [1]
        for i in range(2, N+1):
            l, r = -1, len(res) - 1
            while l < r:
                mid = (l + r + 1) >> 1
                if compare(res[mid],i):
                    l = mid
                else:
                    r = mid - 1
            res.insert(l+1, i)

        return res

