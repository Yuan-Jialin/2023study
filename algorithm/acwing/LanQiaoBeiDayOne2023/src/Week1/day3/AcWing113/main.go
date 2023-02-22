/**
 * @Author 袁佳林
 * @Description 和杨帆出去玩
 * @Date 2023/2/22 21:09
 */

func specialSort(N int) []int {
    arr := make([]int, N)
    for i := 0; i < N; i++ {
        arr[i] = i + 1
    }
    sort.Slice(arr, func(i, j int) bool {return compare(arr[i], arr[j])})
    return arr
}