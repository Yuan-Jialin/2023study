

/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/22 21:16
 */

import "fmt"

func main() {
    var n, res int
    var s string
    fmt.Scanf("%d\n%s", &n, &s)
    for i := 0; i < n; i ++ {
        if s[i] == 'x' {
            j := i
            for ; j < n && s[i] == s[j]; {
                j ++ ;
            }
            len := j - i
            if len >= 3 {
                res += len - 2
            }
            i = j - 1
        }
    }
    fmt.Println(res)
}

