package Week1.day3.AcWing113;

/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/22 21:09
 */
class Solution extends Relation {
    public int[] specialSort(int N) {
        int[] res = new int[N];
        res[0] = 1;
        for(int i = 2;i <= N;i++) {
            // 二分插入点
            int l = 0, r = i - 2;
            while(l < r) {
                int mid = l + ((r - l) >> 1);
                if(compare(i, res[mid])) {
                    r = mid;
                } else {
                    l = mid + 1;
                }
            }

            int j = i - 1;
            if(compare(i,res[l])) { // 当前有解
                // 插入
                while(j > l) {
                    res[j] = res[j - 1];
                    j--;
                }
            }
            res[j] = i;
        }
        return res;
    }
}

