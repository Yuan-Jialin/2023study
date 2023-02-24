

/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/24 15:15
 */
import (
    "fmt"
    "os"
    "bufio"
    )

var (
    out = bufio.NewWriter(os.Stdout)
    in = bufio.NewReader(os.Stdin)

    )

func main() {
    n, m, x := 0, 0,0
    fmt.Fscan(in, &n, &m, &x)
    a := make([]int, n)
    b := make([]int, m)
    for i := 0; i < n; i++ {fmt.Fscan(in, &a[i])}
    for j := 0; j < m; j++ {fmt.Fscan(in, &b[j])}
    for i, j:= 0, m - 1; i < n; i++ {
        for j >= 0 && a[i] + b[j] > x {j--}
        if a[i] + b[j] == x {
            fmt.Fprint(out, i, " ", j)
            break
        }
    }
    out.Flush()
}

